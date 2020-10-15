package pe.edu.upeu.parcial1_jorgequispe.daoimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.parcial1_jorgequispe.dao.PedidosDao;
import pe.edu.upeu.parcial1_jorgequispe.entity.pedidos;
@Repository
public class PedidosDaoImp implements PedidosDao {
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(pedidos p) {
		String sql = "insert into pedidos(idpedidos, fecha, direccion_entrega, idusuario)values(?,?,?,?)";
		return jdbcTemplate.update(sql , p.getIdpedidos() , p.getFecha() , p.getDireccion_entrega() , p.getIdusuario());
	}

	@Override
	public int update(pedidos p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public pedidos read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
