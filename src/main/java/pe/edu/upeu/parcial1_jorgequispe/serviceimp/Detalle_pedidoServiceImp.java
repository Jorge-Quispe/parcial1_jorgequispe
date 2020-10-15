package pe.edu.upeu.parcial1_jorgequispe.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.parcial1_jorgequispe.dao.Detalle_pedidoDao;
import pe.edu.upeu.parcial1_jorgequispe.entity.detalle_pedido;
import pe.edu.upeu.parcial1_jorgequispe.service.Detalle_pedidoService;
@Service
public class Detalle_pedidoServiceImp implements Detalle_pedidoService {
@Autowired
private Detalle_pedidoDao detalle_pedidoDao;
	@Override
	public int create(detalle_pedido p) {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.create(p);
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
		// TODO Auto-generated method stub
		return detalle_pedidoDao.readAll();
	}

}
