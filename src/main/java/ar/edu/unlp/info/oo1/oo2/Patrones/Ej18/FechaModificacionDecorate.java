package ar.edu.unlp.info.oo1.oo2.Patrones.Ej18;

public class FechaModificacionDecorate extends FileManager {
	public FechaModificacionDecorate(File file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return " - " + wrappe.getFechaModificacion();
	}
}
