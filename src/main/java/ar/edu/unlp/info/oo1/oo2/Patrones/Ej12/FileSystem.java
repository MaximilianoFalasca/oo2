package ar.edu.unlp.info.oo1.oo2.Patrones.Ej12;

import java.time.LocalDate;
import java.util.List;

public abstract class FileSystem {
	private String nombre;
	private LocalDate fechaCreacion;
	
	public FileSystem(String nombre, LocalDate fechaCreacion) {
		super();
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}

	 public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	   * Retorna el espacio total ocupado, incluyendo todo su contenido.
	   */
	abstract public int tamanoTotalOcupado();

	/**
	 * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
	 * filesystem 
	 */
	abstract public Archivo archivoMasGrande();

	/**
	 * Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	 * del filesystem
	 */
	abstract public Archivo archivoMasNuevo();

	/**
	 * Retorna el primer elemento con el nombre solicitado contenido en cualquier
	 * nivel del filesystem
	 */
	abstract public FileSystem buscar(String nombre);

	/**
	 * Retorna la lista con los elementos que coinciden con el nombre solicitado 
	 * contenido en cualquier nivel del filesystem
	 */
	abstract public List<FileSystem> buscarTodos(String nombre);

	/**
	 * Retorna un String con los nombres de los elementos contenidos en todos los 
	 * niveles del filesystem. De cada elemento debe retornar el path completo
	 * (similar al comando pwd de linux) siguiendo el modelo presentado a
	 * continuación
	/Directorio A
	/Directorio A/Directorio A.1
	/Directorio A/Directorio A.1/Directorio A.1.1
	/Directorio A/Directorio A.1/Directorio A.1.2 	
	/Directorio A/Directorio A.2
	/Directorio B
	 */
	public String listadoDeContenido() {
	    return listadoDeContenidoConPath("");
	}
	
	protected abstract String listadoDeContenidoConPath(String pathPadre);
}
