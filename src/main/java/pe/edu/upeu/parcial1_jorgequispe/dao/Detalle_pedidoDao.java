package pe.edu.upeu.parcial1_jorgequispe.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.parcial1_jorgequispe.entity.detalle_pedido;


public interface Detalle_pedidoDao {
	int create (detalle_pedido p);
	int update (detalle_pedido p );
	int delete (int id);
	detalle_pedido read(int id);
	List<Map<String, Object>> readAll();
}
