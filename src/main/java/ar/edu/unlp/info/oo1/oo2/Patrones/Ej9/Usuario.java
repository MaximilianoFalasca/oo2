package ar.edu.unlp.info.oo1.oo2.Patrones.Ej9;

import java.util.List;

public class Usuario {
	private String nombre;
	private List<AutoEnAlquiler> autosEnAlquiler;

	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void alquilarAuto(AutoEnAlquiler auto) {
		autosEnAlquiler.add(auto);
	}
}
