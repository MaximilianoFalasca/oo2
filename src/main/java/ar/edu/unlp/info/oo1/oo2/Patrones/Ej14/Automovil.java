package ar.edu.unlp.info.oo1.oo2.Patrones.Ej14;

import java.time.LocalDate;

public class Automovil implements PrendaComponent{
	private int modelo;
	private double kilometraje,costoPor0km;
	
	public double obtenerLiquidez() {
		return 0.7;
	}
	
	public double obtenerValor() {
		return costoPor0km - ((costoPor0km * 0.1) * (LocalDate.now().getYear() - modelo));
	}
	
	public double obtenerValorPrendario() {	
		return obtenerLiquidez() * obtenerValor();
	}
}
