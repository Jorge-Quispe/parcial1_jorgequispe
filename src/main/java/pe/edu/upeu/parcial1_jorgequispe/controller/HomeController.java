package pe.edu.upeu.parcial1_jorgequispe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.parcial1_jorgequispe.entity.usuario;
import pe.edu.upeu.parcial1_jorgequispe.security.JwtUtil;
@RestController
public class HomeController {
	@GetMapping("/")
	public String mensaje() {
		return "Bienvenido al Sistema :)";
	  }
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
    private JwtUtil jwtUtil;
	 @PostMapping("/authenticate")
	 public String generateToken(@RequestBody usuario authRequest) throws Exception {
	        try {
	        	System.out.println(authRequest.getNomuser());
	            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getNomuser(), authRequest.getClave()));
	        } catch (Exception ex) {
	            throw new Exception("Error: "+ex);
	        }
return jwtUtil.generateToken(authRequest.getNomuser());
	    }

}
