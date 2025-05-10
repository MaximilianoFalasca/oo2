package ar.edu.unlp.info.oo1.oo2.Patrones.Ej13;

public class Vegano extends SandwichBuilder{
	public void agregarPan() {
		sandwich.agregarComponente(new Pan("integral", 100));
	}
	
	public void agregarAderezo() {
		sandwich.agregarComponente(new Aderezo("salsa criolla", 20));
	}
	
	public void agregarPrincipal() {
		sandwich.agregarComponente(new Principal("milanesa de girgolas", 500));
	}
	
	public void agregarAdicional() {
	}
}
