package ar.edu.unlp.info.oo1.oo2.Patrones.Ej12;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends FileSystem{
	private List<FileSystem> contenido;
	
	public Directorio(String nombre, LocalDate fechaCreacion, List<FileSystem> contenido) {
		super(nombre, fechaCreacion);
		this.contenido = contenido;
	}
	
	public int tamanoTotalOcupado() {
		return 32 + contenido.stream().mapToInt(elemento->elemento.tamanoTotalOcupado()).sum();
	}
	
	public Archivo archivoMasGrande() {
		return contenido.stream()
				.map(f -> f.archivoMasGrande())
				.max((o1,o2)->Integer.compare(o1.tamanoTotalOcupado(), o2.tamanoTotalOcupado()))
				.orElse(null);
	}
	
	public Archivo archivoMasNuevo() {
		return contenido.stream()
				.map(f -> f.archivoMasGrande())
				.min((o1,o2)->Integer.compare(o1.tamanoTotalOcupado(), o2.tamanoTotalOcupado()))
				.orElse(null);
	}
	
	public FileSystem buscar(String nombre) {
		return contenido.stream().filter(f->f.buscar(nombre)!=null).findFirst().orElse(null);
	    //return buscarTodos(nombre).get(0);
	}
	
	public List<FileSystem> buscarTodos(String nombre){
		return contenido.stream().filter(f->f.buscar(nombre)!=null).collect(Collectors.toList());
	}
	
	protected String listadoDeContenidoConPath(String pathPadre) {
	    String pathActual = pathPadre + "/" + this.getNombre();
	    return contenido.stream()
	        .map(f -> f.listadoDeContenidoConPath(pathActual))
	        .reduce(pathActual, (acum, listado) -> acum + "\n" + listado);
	}
}
