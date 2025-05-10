package ar.edu.unlp.info.oo1.oo2.Patrones.Ej10;

public class Mensajero {
	private Cifrado cifrado;
	
	public String enviar(String mensaje) {
		return cifrado.encrypt(mensaje);
	}
	
	public String recibir(String mensaje) {
		return cifrado.decript(mensaje);
	}
	
	public void setStratergy(Cifrado cifrado) {
		this.cifrado = cifrado;
	}
}
