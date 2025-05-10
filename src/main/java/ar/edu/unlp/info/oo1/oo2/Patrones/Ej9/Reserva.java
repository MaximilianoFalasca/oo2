package ar.edu.unlp.info.oo1.oo2.Patrones.Ej9;

import java.time.LocalDate;

public class Reserva {
	private Usuario conductor;
	private AutoEnAlquiler auto;
	private int cantidadDias;
	private LocalDate fecha;
	
	public Reserva(Usuario conductor, AutoEnAlquiler auto, int cantidadDias, LocalDate fecha) {
		super();
		this.conductor = conductor;
		this.auto = auto;
		this.cantidadDias = cantidadDias;
		this.fecha = fecha;
	}
	
	public double montoAPagar() {
		return auto.getPrecioPorDia() * cantidadDias;
	}
	
	public double montoAReembolzar(LocalDate fechaTentativa) {
		double monto = 0.0;
		if(fechaTentativa.isBefore(fecha)) {
			monto = montoAPagar() * auto.montoAReembolzar(fecha,fechaTentativa);
		}else {
			System.out.println("No se puede cancelar si la fecha es igual o posterior a la fecha de la reserva");
		}
		return monto;
	}
}
