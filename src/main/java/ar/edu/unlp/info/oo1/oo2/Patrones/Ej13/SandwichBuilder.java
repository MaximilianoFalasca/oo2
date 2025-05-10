package ar.edu.unlp.info.oo1.oo2.Patrones.Ej13;

abstract public class SandwichBuilder {
	protected Sandwich sandwich;
	
	public void reset() {
		sandwich = new Sandwich();
	}
	
	abstract public void agregarPan();
	abstract public void agregarAderezo();
	abstract public void agregarPrincipal();
	abstract public void agregarAdicional();
	
	public Sandwich getSandwich() {
		return sandwich;
	}
}
