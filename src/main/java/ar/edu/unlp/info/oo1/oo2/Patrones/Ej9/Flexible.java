package ar.edu.unlp.info.oo1.oo2.Patrones.Ej9;

import java.time.LocalDate;

public class Flexible implements PoliticaCancelacion{
	public double montoAReembolzar(LocalDate fechaReserva, LocalDate fechaTentativaCancelacion) {
		return 100;
	}
}
