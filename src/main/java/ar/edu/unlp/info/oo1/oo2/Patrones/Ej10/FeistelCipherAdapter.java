package ar.edu.unlp.info.oo1.oo2.Patrones.Ej10;

public class FeistelCipherAdapter extends Cifrado{
	private FeistelCipher feistelCipher;
	
	public FeistelCipherAdapter(String key, FeistelCipher feistelCipher) {
		super(key);
		this.feistelCipher = feistelCipher;
	}
	public String encrypt(String mensaje) {
		return feistelCipher.encode(mensaje);
	}
	public String decript(String mensaje) {
		return feistelCipher.encode(mensaje);
	}
}
