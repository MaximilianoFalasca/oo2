package ar.edu.unlp.info.oo1.oo2.Patrones.Ej9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements PoliticaCancelacion{
	public double montoAReembolzar(LocalDate fechaReserva, LocalDate fechaTentativaCancelacion) {
		double monto=0.0;
		long diasDiferencia = ChronoUnit.DAYS.between(fechaReserva, fechaTentativaCancelacion);
		
		if(diasDiferencia >= 7) {
			monto = 100;
		}else if(diasDiferencia >= 2){
			monto = 50;
		}
		
		return monto;
	}
}
