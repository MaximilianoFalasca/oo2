package ar.edu.unlp.info.oo1.oo2.Patrones.Ej2;

public class Pasante extends Empleado{
	private int examenesRendidos;
	
	public Pasante(int examenesRendidos) {
		super();
		this.examenesRendidos = examenesRendidos;
	}

	@Override
	public int basico() {
		return 20000;
	}

	@Override
	public int adicional() {
		return 2000*examenesRendidos;
	}
}
