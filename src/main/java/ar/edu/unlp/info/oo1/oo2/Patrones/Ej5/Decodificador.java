package ar.edu.unlp.info.oo1.oo2.Patrones.Ej5;

import java.util.List;

public class Decodificador {
	private Stratergy stratergy;
	private List<Pelicula> peliculas;
	private List<Pelicula> vistas;
	
	public Decodificador(List<Pelicula> peliculas, Stratergy stratergy) {
		super();
		this.peliculas = peliculas;
		this.stratergy = stratergy;
	}
	
	public void setStratergy(Stratergy stratergy) {
		this.stratergy = stratergy;
	}
	
	public List<Pelicula> obtenerRecomendaciones(){
		return stratergy.obtenerRecomendaciones(peliculas, vistas);
	}
}
