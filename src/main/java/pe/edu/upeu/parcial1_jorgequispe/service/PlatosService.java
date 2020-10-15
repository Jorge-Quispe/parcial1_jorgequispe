package pe.edu.upeu.parcial1_jorgequispe.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.parcial1_jorgequispe.entity.platos;

public interface PlatosService {
	int create (platos p);
	int update (platos p );
	int delete (int id);
	platos read(int id);
	List<Map<String, Object>> readAll();
}
