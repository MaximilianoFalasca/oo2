package ar.edu.unlp.info.oo1.oo2.Patrones.Ej18;

public class FechaCreacionDecorator extends FileManager {
	public FechaCreacionDecorator(File file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return " - " + wrappe.getFechaCreacion();
	}
}
