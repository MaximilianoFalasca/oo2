package ar.edu.unlp.info.oo1.oo2.Patrones.Ej5;

import java.util.List;

public class Pelicula {
	private String titulo;
	private int anioEstreno;
	private double puntaje;
	private List<Pelicula> similitud;
	
	public Pelicula(String titulo, int anioEstreno, double puntaje, List<Pelicula> similitud) {
		super();
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		this.similitud = similitud;
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}

	public List<Pelicula> getSimilitud() {
		return similitud;
	}

	public void setSimilitud(List<Pelicula> similitud) {
		this.similitud = similitud;
	}
	
	
}
