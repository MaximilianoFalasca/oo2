package ar.edu.unlp.info.oo1.oo2.Patrones.Ej10;

public class RC4Adapter extends Cifrado{
	private RC4 rc4;
	
	public RC4Adapter(String key, RC4 rc4) {
		super(key);
		this.rc4 = rc4;
	}
	public String encrypt(String mensaje) {
		return rc4.encriptar(mensaje, key);
	}
	public String decript(String mensaje) {
		return rc4.desencriptar(mensaje, key);
	}
}
