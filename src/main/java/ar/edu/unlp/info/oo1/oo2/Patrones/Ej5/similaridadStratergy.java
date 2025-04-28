package ar.edu.unlp.info.oo1.oo2.Patrones.Ej5;

import java.util.List;
import java.util.stream.Collectors;

public class similaridadStratergy implements Stratergy{
	public List<Pelicula> obtenerRecomendaciones(List<Pelicula> peliculas, List<Pelicula> vistas) {	
		return peliculas.stream()
				.filter(pelicula->
					vistas.stream().anyMatch(vista -> vista.equals(pelicula))
				)
				.sorted((ex1,ex2)->
					Integer.compare(ex2.getAnioEstreno(), ex1.getAnioEstreno())
				)
				.collect(Collectors.toList());
	}
}
