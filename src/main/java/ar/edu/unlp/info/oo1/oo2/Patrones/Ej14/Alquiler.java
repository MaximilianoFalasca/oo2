package ar.edu.unlp.info.oo1.oo2.Patrones.Ej14;

import java.time.LocalDate;

public class Alquiler implements PrendaComponent{
	private double costoMensual;
	private LocalDate comienzoContrato,finContrato;
	
	public double obtenerLiquidez() {
		return 0.9;
	}
	
	public double obtenerValor() {
		int mesesFaltantes = finContrato.getMonth().getValue() - comienzoContrato.getMonth().getValue();
		if(mesesFaltantes>0) {
			return (mesesFaltantes) * costoMensual;
		}
		return 0;
	}
	
	public double obtenerValorPrendario() {	
		return obtenerLiquidez() * obtenerValor();
	}
}
