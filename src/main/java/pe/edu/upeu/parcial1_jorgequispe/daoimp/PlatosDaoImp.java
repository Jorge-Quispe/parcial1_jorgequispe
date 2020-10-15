package pe.edu.upeu.parcial1_jorgequispe.daoimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.parcial1_jorgequispe.dao.PlatosDao;
import pe.edu.upeu.parcial1_jorgequispe.entity.platos;
@Repository
public class PlatosDaoImp implements PlatosDao {
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(platos p) {
		String sql = "insert into platos(idplatos, nombre , precio , cantidad)values(?,?,?,?)";
		
		return jdbcTemplate.update(sql , p.getIdplatos() , p.getNombre() , p.getPrecio() , p.getCantidad());
	}

	@Override
	public int update(platos p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public platos read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "select * from platos";
		return jdbcTemplate.queryForList(sql);
	}

}
