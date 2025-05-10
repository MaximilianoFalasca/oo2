package ar.edu.unlp.info.oo1.oo2.Patrones.Ej12;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends FileSystem{
	private int tamañoEnBytes;

	public Archivo(String nombre, LocalDate fechaCreacion, int tamañoEnBytes) {
		super(nombre, fechaCreacion);
		this.tamañoEnBytes = tamañoEnBytes;
	}

	public int tamanoTotalOcupado() {
		return tamañoEnBytes;
	}
	
	public Archivo archivoMasGrande() {
		return this;
	}
	
	public Archivo archivoMasNuevo() {
		return this;
	}
	
	public FileSystem buscar(String nombre) {
		return this.getNombre().equals(nombre) ? this : null;
	}
	
	//????
	public List<FileSystem> buscarTodos(String nombre){
		return null;
	}
	
	protected String listadoDeContenidoConPath(String pathPadre) {
	    return pathPadre + "/" + this.getNombre();
	}
}
