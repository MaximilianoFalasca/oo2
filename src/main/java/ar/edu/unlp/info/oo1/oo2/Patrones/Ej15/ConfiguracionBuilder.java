package ar.edu.unlp.info.oo1.oo2.Patrones.Ej15;

public abstract class ConfiguracionBuilder {
	protected Equipo equipo;
	protected Catalogo catalogo;
	
	public ConfiguracionBuilder(Equipo equipo, Catalogo catalogo) {
		super();
		this.equipo = equipo;
		this.catalogo = catalogo;
	}
	
	abstract public void agregarProcesador();
	abstract public void agregarMemoriaRam();
	abstract public void agregarDisco();
	abstract public void agregarTarjetaGrafica();
	abstract public void agregarGabinete();
	
	abstract public Equipo obtenerEquipo();
}
