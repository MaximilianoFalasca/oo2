package ar.edu.unlp.info.oo1.oo2.Patrones.Ej14;

import java.util.List;

public class PrendaCombinada implements PrendaComponent{
	private List<PrendaComponent> componentes;
	
	public double obtenerLiquidez() {
		return 0.5;
	}
	
	public double obtenerValor() {
		return componentes.stream().mapToDouble(componente->componente.obtenerValor()).sum();
	}
	
	public double obtenerValorPrendario() {	
		return obtenerLiquidez() * obtenerValor();
	}
}
