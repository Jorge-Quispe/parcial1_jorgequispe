package pe.edu.upeu.parcial1_jorgequispe.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.parcial1_jorgequispe.dao.UsuarioDao;
import pe.edu.upeu.parcial1_jorgequispe.entity.usuario;
import pe.edu.upeu.parcial1_jorgequispe.service.UsuarioService;
@Service
public class UsuarioServiceImp implements UsuarioService {
	@Autowired
	private UsuarioDao usuarioDao;
	@Override
	public int create(usuario p) {
		// TODO Auto-generated method stub
		return usuarioDao.create(p);
	}

	@Override
	public int update(usuario p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public usuario read(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return usuarioDao.readAll();
	}

	@Override
	public usuario read(String nomuser) {
		// TODO Auto-generated method stub
		return usuarioDao.read(nomuser);
	}

}
