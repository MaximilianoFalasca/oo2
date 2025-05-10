package ar.edu.unlp.info.oo1.oo2.Patrones.Ej15;

import java.time.LocalDate;

public class Presupuesto {
	private Persona persona;
	private LocalDate fecha;
	private Equipo equipo;
	
	public double precioAPagar() {
		return equipo.calcularPrecio();
	}
}
