package ar.edu.unlp.info.oo1.oo2.Patrones.Ej13;

public class SinTACC extends SandwichBuilder{
	public void agregarPan() {
		sandwich.agregarComponente(new Pan("pan de chipá", 150));
	}
	
	public void agregarAderezo() {
		sandwich.agregarComponente(new Aderezo("salsa tártara", 18));
	}
	
	public void agregarPrincipal() {
		sandwich.agregarComponente(new Principal("carne de pollo", 250));
	}
	
	public void agregarAdicional() {
		sandwich.agregarComponente(new Adicional("verduras grilladas", 200));
	}
}
