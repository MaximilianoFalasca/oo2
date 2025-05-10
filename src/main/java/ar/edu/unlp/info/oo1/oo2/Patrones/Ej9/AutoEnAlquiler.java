package ar.edu.unlp.info.oo1.oo2.Patrones.Ej9;

import java.time.LocalDate;

public class AutoEnAlquiler {
	private double precioPorDia;
	private int cantidadPlazas;
	private String marca;
	private PoliticaCancelacion politica;
	
	public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca) {
		super();
		this.precioPorDia = precioPorDia;
		this.cantidadPlazas = cantidadPlazas;
		this.marca = marca;
	}

	public double getPrecioPorDia() {
		return precioPorDia;
	}
	
	public double montoAReembolzar(LocalDate fechaReserva, LocalDate fechaTentativaCancelacion) {
		return politica.montoAReembolzar(fechaReserva, fechaTentativaCancelacion);
	}
	
	public void setStratergy(PoliticaCancelacion politica) {
		this.politica = politica;
	}
}
