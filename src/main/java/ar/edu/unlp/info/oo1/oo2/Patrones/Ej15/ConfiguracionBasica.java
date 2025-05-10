package ar.edu.unlp.info.oo1.oo2.Patrones.Ej15;

public class ConfiguracionBasica extends ConfiguracionBuilder{
	public void agregarProcesador() {
		equipo.agregarComponente(catalogo.getComponente("Procesador Basico"));
	}
	
	public void agregarMemoriaRam() {
		equipo.agregarComponente(catalogo.getComponente("Memoria ram Basico"));
	}
	
	public void agregarDisco() {
		equipo.agregarComponente(catalogo.getComponente("Disco Basico"));
	}
	
	public void agregarTarjetaGrafica() {
		equipo.agregarComponente(catalogo.getComponente("Tarjeta gráfica Basico"));
	}
	
	public void agregarGabinete() {
		equipo.agregarComponente(catalogo.getComponente("Gabinete Basico"));
	}
	
	public Equipo obtenerEquipo() {
		return equipo;
	}
}
