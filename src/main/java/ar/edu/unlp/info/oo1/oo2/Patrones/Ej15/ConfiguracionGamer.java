package ar.edu.unlp.info.oo1.oo2.Patrones.Ej15;

public class ConfiguracionGamer extends ConfiguracionBuilder{
	public void agregarProcesador() {
		equipo.agregarComponente(catalogo.getComponente("Procesador Gamer"));
	}
	
	public void agregarMemoriaRam() {
		equipo.agregarComponente(catalogo.getComponente("Memoria ram Gamer"));
	}
	
	public void agregarDisco() {
		equipo.agregarComponente(catalogo.getComponente("Disco Gamer"));
	}
	
	public void agregarTarjetaGrafica() {
		equipo.agregarComponente(catalogo.getComponente("Tarjeta gráfica Gamer"));
	}
	
	public void agregarGabinete() {
		equipo.agregarComponente(catalogo.getComponente("Gabinete Gamer"));
	}
	
	public Equipo obtenerEquipo() {
		return equipo;
	}
}
