package ar.edu.unlp.info.oo1.oo2.Patrones.Ej18;

import java.time.LocalDate;

public class FileOO2 implements File{
	private String nombre, extension, permisos;
	private double tamaño;
	private LocalDate fechaCreacion, fechaModificacion;
	
	public FileOO2(String nombre, String extension, String permisos, double tamaño, LocalDate fechaCreacion,
			LocalDate fechaModificacion) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.permisos = permisos;
		this.tamaño = tamaño;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public String getPermisos() {
		return permisos;
	}

	public double getTamaño() {
		return tamaño;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}
	
	public String prettyPrint() {
		return nombre;
	}
}
