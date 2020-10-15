package pe.edu.upeu.parcial1_jorgequispe.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.parcial1_jorgequispe.entity.personas;

public interface PersonasService {
	int create (personas p);
	int update (personas p );
	int delete (int id);
	personas read(int id);
	List<Map<String, Object>> readAll();

}
