package ar.edu.unlp.info.oo1.oo2.Patrones.Ej13;

public class Adicional implements SandwichComponent{
	private String nombre;
	private int precio;
	
	public Adicional(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public double obtenerPrecio() {
		return precio;
	}
}
