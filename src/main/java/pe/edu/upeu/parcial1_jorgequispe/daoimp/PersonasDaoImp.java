package pe.edu.upeu.parcial1_jorgequispe.daoimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.parcial1_jorgequispe.dao.PersonasDao;
import pe.edu.upeu.parcial1_jorgequispe.entity.personas;

@Repository
public class PersonasDaoImp implements PersonasDao {
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(personas p) {
		String sql = "insert into personas(idpersonas, nombres , correo , telefono)values(?,?,?,?)";
		return jdbcTemplate.update(sql,p.getIdpersonas() , p.getNombres(),p.getCorreo() , p.getTelefono() );
	}

	@Override
	public int update(personas p) {
		String sql = "update personas set nombres = ? , correo = ? , telefono = ? where ipersonas = ?";
		return jdbcTemplate.update(sql , p.getNombres() , p.getCorreo() , p.getTelefono() , p.getIdpersonas());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public personas read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "select * from personas";
		return jdbcTemplate.queryForList(sql);
	}

}
