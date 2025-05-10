package ar.edu.unlp.info.oo1.oo2.Patrones.Ej10;

abstract public class Cifrado {
	protected String key;

	public Cifrado(String key) {
		super();
		this.key = key;
	}
	
	abstract String encrypt(String mensaje);
	abstract String decript(String mensaje);
}
