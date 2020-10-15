package pe.edu.upeu.parcial1_jorgequispe.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.parcial1_jorgequispe.entity.usuario;

public interface UsuarioService {
	int create (usuario p);
	int update (usuario p );
	int delete (int id);
	usuario read(int id);
	List<Map<String, Object>> readAll();
	public usuario read(String nomuser);
}
