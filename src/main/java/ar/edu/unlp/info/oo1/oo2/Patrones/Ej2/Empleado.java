package ar.edu.unlp.info.oo1.oo2.Patrones.Ej2;

public abstract class Empleado {
	public double sueldo() {
		return this.basico()+this.adicional()-this.descuento();
	}
	
	public double descuento() {
		return this.basico()*0.13+this.adicional()*0.05;
	}
	
	public abstract int basico();
	public abstract int adicional();
}
