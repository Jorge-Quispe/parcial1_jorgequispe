package pe.edu.upeu.parcial1_jorgequispe;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.parcial1_jorgequispe.dao.Detalle_pedidoDao;
import pe.edu.upeu.parcial1_jorgequispe.dao.PedidosDao;
import pe.edu.upeu.parcial1_jorgequispe.dao.PersonasDao;
import pe.edu.upeu.parcial1_jorgequispe.dao.PlatosDao;
import pe.edu.upeu.parcial1_jorgequispe.dao.UsuarioDao;
import pe.edu.upeu.parcial1_jorgequispe.entity.detalle_pedido;
import pe.edu.upeu.parcial1_jorgequispe.entity.pedidos;
import pe.edu.upeu.parcial1_jorgequispe.entity.personas;
import pe.edu.upeu.parcial1_jorgequispe.entity.platos;
import pe.edu.upeu.parcial1_jorgequispe.entity.usuario;

@SpringBootTest
class Parcial1JorgequispeApplicationTests {
@Autowired
private PersonasDao personaDao;
@Autowired
private UsuarioDao usuarioDao;
@Autowired
private PlatosDao platosDao;
@Autowired
private PedidosDao pedidosDao;
@Autowired
private Detalle_pedidoDao detalle_pedidoDao;
	@Test
	void contextLoads() {
	//	personas p= new personas();
		//p.setIdpersonas(1);
		//p.setNombres("Jorge");
	//	p.setCorreo("jorgequispes@upeu.edu.pe");
		//p.setTelefono("960362600");
		//System.out.println(personaDao.create(p));
		
		//usuario u = new usuario();
		//u.setIdusuario(1);
		//u.setNomuser("jorgeluis");
		//u.setClave("1234");
		//u.setIdpersonas(1);
		//System.out.println(usuarioDao.create(u));
		
		//platos p = new platos();
		//p.setIdplatos(1);
		//p.setNombre("ceviche");
		//p.setCantidad(2);
		//p.setPrecio(30);
		//System.out.println(platosDao.create(p));
		
		//pedidos p = new pedidos();
		//p.setIdpedidos(1);
		//p.setFecha("15/10/2020");
		//p.setDireccion_entrega("AV. Las sirenitas 435");
		//p.setIdusuario(1);
		//System.out.println(pedidosDao.create(p));
		
		//detalle_pedido d = new detalle_pedido();
		//d.setIddetalle_pedido(1);
		//d.setPrecio(60);
		//d.setCantidad(2);
		//d.setIdplatos(1);
		//d.setIdpedidos(1);
		//System.out.println(detalle_pedidoDao.create(d));
	}

}
