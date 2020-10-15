package pe.edu.upeu.parcial1_jorgequispe.daoimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.parcial1_jorgequispe.dao.UsuarioDao;
import pe.edu.upeu.parcial1_jorgequispe.entity.usuario;
@Repository
public class UsuarioDaoImp implements UsuarioDao {
@Autowired
private JdbcTemplate jdbcTemplate;

	@Override
	public int create(usuario p) {
		String sql = "insert into usuario(idusuario, nomuser , clave , idpersonas) values (?,?,?,?)";
		
		return jdbcTemplate.update(sql , p.getIdusuario() , p.getNomuser() , p.getClave() , p.getIdpersonas());
	}

	@Override
	public int update(usuario p) {
		String sql = "update usuario set nomuser = ? , clave = ? where idusuario = ?";
		return jdbcTemplate.update(sql , p.getNomuser() , p.getClave() , p.getIdusuario());
	}

	@Override
	public int delete(int id) {
		String sql = "delete from usuario where idusuario = ?";
		return jdbcTemplate.update(sql,id);
	}

	@Override
	public usuario read(int id) {
		String sql = "select * from usuario where idusuario = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id} , new BeanPropertyRowMapper<usuario>(usuario.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "select * from usuario";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public usuario read(String nomuser) {
		String  sql = "select * from usuario where nomuser = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {nomuser}, new BeanPropertyRowMapper<usuario>(usuario.class));	
		}

}
