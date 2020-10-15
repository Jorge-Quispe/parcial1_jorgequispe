package pe.edu.upeu.parcial1_jorgequispe.daoimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.parcial1_jorgequispe.dao.Detalle_pedidoDao;
import pe.edu.upeu.parcial1_jorgequispe.entity.detalle_pedido;
@Repository
public class Detalle_pedidoDaoImp implements Detalle_pedidoDao {
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(detalle_pedido p) {
		String sql = "insert into detalle_pedido(iddetalle_pedido , precio , cantidad , idplatos , idpedidos) values (?,?,?,?,?)";
		return jdbcTemplate.update(sql , p.getIddetalle_pedido() , p.getPrecio() , p.getCantidad() , p.getIdplatos() , p.getIdpedidos());
	}

	@Override
	public int update(detalle_pedido p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public detalle_pedido read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "select * from detalle_pedido";
		return jdbcTemplate.queryForList(sql);
	}

}
