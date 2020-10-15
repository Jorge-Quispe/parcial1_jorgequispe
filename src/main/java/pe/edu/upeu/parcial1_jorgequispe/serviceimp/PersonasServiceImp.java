package pe.edu.upeu.parcial1_jorgequispe.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.parcial1_jorgequispe.dao.PersonasDao;
import pe.edu.upeu.parcial1_jorgequispe.entity.personas;
import pe.edu.upeu.parcial1_jorgequispe.service.PersonasService;
@Service
public class PersonasServiceImp implements PersonasService {
	@Autowired
	private PersonasDao personaDao;
	@Override
	public int create(personas p) {
		// TODO Auto-generated method stub
		return personaDao.create(p);
	}

	@Override
	public int update(personas p) {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		return personaDao.readAll();
	}

}
