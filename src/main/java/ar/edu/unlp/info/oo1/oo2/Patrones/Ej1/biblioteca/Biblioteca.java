package ar.edu.unlp.info.oo1.oo2.Patrones.Ej1.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Socio> socios;
	private VoorheesExporter exporter;

	public Biblioteca() {
		socios = new ArrayList<>();
		exporter= new VoorheesExporter(); 
	}	

	public void agregarSocio(Socio socio) {
		socios.add(socio);
	}

	/**
	 * Retorna la representación JSON de la colección de socios.
	 */
	public String exportarSocios() {
		return exporter.exportar(socios);
	}

	public VoorheesExporter getExporter() {
		return exporter;
	}

	public void setExporter(VoorheesExporter exporter) {
		this.exporter = exporter;
	}
}
