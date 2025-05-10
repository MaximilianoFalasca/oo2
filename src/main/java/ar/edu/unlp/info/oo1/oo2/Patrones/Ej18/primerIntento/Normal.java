package ar.edu.unlp.info.oo1.oo2.Patrones.Ej18.primerIntento;

public class Normal extends FileManager {
	public Normal(File file) {
		super(file);
	}
	
	@Override
	public String getDatosAdicionales() {
		return "";
	}
}
