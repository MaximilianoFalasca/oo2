package ar.edu.unlp.info.oo1.oo2.Patrones.Ej18.primerIntento;

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
	
	// no esta bien, el extension es porq siempre lo combina con el normal, no por otra cosa.
	// el normal se tendria que llamar con extension.
	// tendria que hacer uno por parametro.
	public String prettyPrint() {
		return wrappe.prettyPrint() + " - " + getDatosAdicionales() + wrappe.getExtension();
	}
	
	public abstract String getDatosAdicionales();
}
