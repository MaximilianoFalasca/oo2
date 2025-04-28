package ar.edu.unlp.info.oo1.oo2.Patrones.Ej5;

import java.util.List;
import java.util.stream.Collectors;

public class puntajeStratergy implements Stratergy{
	public List<Pelicula> obtenerRecomendaciones(List<Pelicula> peliculas, List<Pelicula> vistas) {	
		return 	peliculas.stream()
				.sorted((ex1,ex2)->{
					int resultado = Double.compare(ex1.getPuntaje(), ex2.getPuntaje());
					if(resultado==0) {
						resultado = Integer.compare(ex2.getAnioEstreno(), ex1.getAnioEstreno());
					}
					return resultado;
				})
				.collect(Collectors.toList());
	}
}
