package ar.edu.unlp.info.oo1.oo2.Patrones.Ej18;

import java.time.LocalDate;

public abstract class FileManager implements File{
	protected File wrappe;
	
	public FileManager(File file) {
		wrappe = file;
	}

	public String getNombre() {
		return wrappe.getNombre();
	}

	public String getExtension() {
		return wrappe.getExtension();
	}

	public String getPermisos() {
		return wrappe.getExtension();
	}

	public double getTamaño() {
		return wrappe.getTamaño();
	}

	public LocalDate getFechaCreacion() {
		return wrappe.getFechaCreacion();
	}

	public LocalDate getFechaModificacion() {
		return wrappe.getFechaModificacion();
	}
	
	public String prettyPrint() {
		return wrappe.prettyPrint();
	}
}
