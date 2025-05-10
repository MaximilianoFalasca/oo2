package ar.edu.unlp.info.oo1.oo2.Patrones.Ej18;

public class TamañoDecorator extends FileManager {
	public TamañoDecorator(File file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return " - " + wrappe.getTamaño();
	}
}
