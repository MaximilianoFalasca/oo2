package ar.edu.unlp.info.oo1.oo2.Patrones.Ej15;

public class ConfiguracionIntermedia extends ConfiguracionBuilder{
	public void agregarProcesador() {
		equipo.agregarComponente(catalogo.getComponente("Procesador Intermedio"));
	}
	
	public void agregarMemoriaRam() {
		equipo.agregarComponente(catalogo.getComponente("Memoria ram Intermedio"));
	}
	
	public void agregarDisco() {
		equipo.agregarComponente(catalogo.getComponente("Disco Intermedio"));
	}
	
	public void agregarTarjetaGrafica() {
		equipo.agregarComponente(catalogo.getComponente("Tarjeta gráfica Intermedio"));
	}
	
	public void agregarGabinete() {
		equipo.agregarComponente(catalogo.getComponente("Gabinete Intermedio"));
	}
	
	public Equipo obtenerEquipo() {
		return equipo;
	}
}
