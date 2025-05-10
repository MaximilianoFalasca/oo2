package ar.edu.unlp.info.oo1.oo2.Patrones.Ej14;

public class Inmueble implements PrendaComponent{
	private String direccion;
	private double superficie,costoPorm2;
	
	public double obtenerLiquidez() {
		return 0.2;
	}
	
	public double obtenerValor() {
		return superficie * costoPorm2;
	}
	
	public double obtenerValorPrendario() {	
		return obtenerLiquidez() * obtenerValor();
	}
}
