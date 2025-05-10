package ar.edu.unlp.info.oo1.oo2.Patrones.Ej13;

public class Vegetariano extends SandwichBuilder{
	public void agregarPan() {
		sandwich.agregarComponente(new Aderezo("con semillas", 120));
	}
	
	public void agregarAderezo() {
		
	}
	
	public void agregarPrincipal() {
		sandwich.agregarComponente(new Principal("provoleta grillada", 200));
	}
	
	public void agregarAdicional() {
		sandwich.agregarComponente(new Adicional("berenjenas al escabeche", 100));
	}
}
