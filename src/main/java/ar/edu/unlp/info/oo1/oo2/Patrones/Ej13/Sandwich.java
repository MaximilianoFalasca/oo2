package ar.edu.unlp.info.oo1.oo2.Patrones.Ej13;

import java.util.List;

public class Sandwich implements SandwichComponent{
	private List<SandwichComponent> componentes;
	
	public void agregarComponente(SandwichComponent componente) {
		componentes.add(componente);
	}
	
	public void eliminarComponente(SandwichComponent componente) {
		componentes.remove(componente);
	}
	
	public double obtenerPrecio() {
		return componentes.stream()
				.mapToDouble(componente->componente.obtenerPrecio())
				.sum();
	}
}
