package pe.edu.upeu.parcial1_jorgequispe.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.parcial1_jorgequispe.dao.PedidosDao;
import pe.edu.upeu.parcial1_jorgequispe.entity.pedidos;
import pe.edu.upeu.parcial1_jorgequispe.service.PedidoService;
@Service
public class PedidoServiceImp implements PedidoService {
	@Autowired
	private PedidosDao pedidosDao;
	@Override
	public int create(pedidos p) {
		// TODO Auto-generated method stub
		return pedidosDao.create(p);
	}

	@Override
	public int update(pedidos p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public pedidos read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return pedidosDao.readAll();
	}

}
