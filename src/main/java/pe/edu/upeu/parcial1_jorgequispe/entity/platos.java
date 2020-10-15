package pe.edu.upeu.parcial1_jorgequispe.entity;

public class platos {
private int idplatos;
private String nombre;
private double precio;
private int cantidad;
public platos(int idplatos, String nombre, double precio, int cantidad) {
	super();
	this.idplatos = idplatos;
	this.nombre = nombre;
	this.precio = precio;
	this.cantidad = cantidad;
}
public platos() {
	// TODO Auto-generated constructor stub
}
public int getIdplatos() {
	return idplatos;
}
public void setIdplatos(int idplatos) {
	this.idplatos = idplatos;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

}
