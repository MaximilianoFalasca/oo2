package ar.edu.unlp.info.oo1.oo2.Patrones.Ej5;

import java.util.List;

public interface Stratergy {
	public List<Pelicula> obtenerRecomendaciones(List<Pelicula> peliculas, List<Pelicula> vistas);
}
