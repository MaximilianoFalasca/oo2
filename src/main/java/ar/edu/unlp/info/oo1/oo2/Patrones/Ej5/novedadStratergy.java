package ar.edu.unlp.info.oo1.oo2.Patrones.Ej5;

import java.util.List;
import java.util.stream.Collectors;

public class novedadStratergy implements Stratergy{
	public List<Pelicula> obtenerRecomendaciones(List<Pelicula> peliculas, List<Pelicula> vistas) {
		return peliculas.stream()
				.sorted((ex1,ex2)-> 
					Integer.compare(ex2.getAnioEstreno(), ex1.getAnioEstreno())
				)
				.limit(3)
				.collect(Collectors.toList());
	}
}
