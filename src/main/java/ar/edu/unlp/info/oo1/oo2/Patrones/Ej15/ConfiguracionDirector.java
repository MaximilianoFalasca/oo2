package ar.edu.unlp.info.oo1.oo2.Patrones.Ej15;

public class ConfiguracionDirector {
	public Equipo contruirEquipo(ConfiguracionBuilder configuracion) {
		configuracion.agregarProcesador();
		configuracion.agregarMemoriaRam();
		configuracion.agregarDisco();
		configuracion.agregarTarjetaGrafica();
		configuracion.agregarGabinete();
		
		return configuracion.obtenerEquipo();
	}
}
