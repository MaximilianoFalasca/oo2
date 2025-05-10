package ar.edu.unlp.info.oo1.oo2.Patrones.Ej18.primerIntento;

public class ConFechaCreacion extends FileManager {
	public ConFechaCreacion(File file) {
		super(file);
	}
	
	@Override
	public String getDatosAdicionales() {
		return wrappe.getFechaCreacion().toString() + " - ";
	}
}
