package pe.edu.upeu.parcial1_jorgequispe.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.parcial1_jorgequispe.dao.PlatosDao;
import pe.edu.upeu.parcial1_jorgequispe.entity.platos;
import pe.edu.upeu.parcial1_jorgequispe.service.PlatosService;
@Service
public class PlatosServiceImp implements PlatosService {
	@Autowired
	private PlatosDao platosDao;
	@Override
	public int create(platos p) {
		// TODO Auto-generated method stub
		return platosDao.create(p);
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
		// TODO Auto-generated method stub
		return platosDao.readAll();
	}

}
