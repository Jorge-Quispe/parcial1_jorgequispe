package pe.edu.upeu.parcial1_jorgequispe.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.parcial1_jorgequispe.entity.pedidos;

public interface PedidoService {
	int create (pedidos p);
	int update (pedidos p );
	int delete (int id);
	pedidos read(int id);
	List<Map<String, Object>> readAll();
}
