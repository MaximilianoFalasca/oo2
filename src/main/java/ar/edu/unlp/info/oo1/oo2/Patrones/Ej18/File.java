package ar.edu.unlp.info.oo1.oo2.Patrones.Ej18;

import java.time.LocalDate;

//sacar los getters y ver si funciona

// no funciona, los tengo que tener porq sino no pueod acceder a esos valores en las 
// instancias del decorator

public interface File {
	public String getNombre();
	public String getExtension();
	public String getPermisos();
	public double getTamaño();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public String prettyPrint();
}
