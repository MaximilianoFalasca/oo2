package ar.edu.unlp.info.oo1.oo2.Patrones.Ej18.primerIntento;

public class ConTamañoYPermisos extends FileManager {
	public ConTamañoYPermisos(File file) {
		super(file);
	}
	
	@Override
	public String getDatosAdicionales() {
		return wrappe.getTamaño() + " - " + wrappe.getPermisos() + " - ";
	}
}
