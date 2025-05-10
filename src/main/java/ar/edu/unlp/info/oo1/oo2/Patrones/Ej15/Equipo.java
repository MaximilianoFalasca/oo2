package ar.edu.unlp.info.oo1.oo2.Patrones.Ej15;

import java.util.List;

public class Equipo {
	private List<Componente> componentes;
	
	public double calcularConsumo() {
		return componentes.stream()
				.mapToDouble(componente->componente.getConsumo()).sum();
	}
	
	public double calcularPrecio() {
		double precioComponentes = componentes.stream()
				.mapToDouble(componente->componente.getPrecio()).sum();
		return precioComponentes + (precioComponentes * 0.21);
	}
	
	public void agregarComponente(Componente componente) {
		componentes.add(componente);
	}
}
