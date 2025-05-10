package ar.edu.unlp.info.oo1.oo2.Patrones.Ej13;

public class Clasico extends SandwichBuilder{
	public void agregarPan() {
		sandwich.agregarComponente(new Pan("brioche", 100));
	}
	
	public void agregarAderezo() {
		sandwich.agregarComponente(new Aderezo("a base de mayonesa", 20));
	}
	
	public void agregarPrincipal() {
		sandwich.agregarComponente(new Principal("carne de ternera", 300));
	}
	
	public void agregarAdicional() {
		sandwich.agregarComponente(new Adicional("tomate", 80));
	}
}
