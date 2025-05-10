package ar.edu.unlp.info.oo1.oo2.Patrones.Ej18;

public class NameDecorator extends FileManager {
	public NameDecorator(File file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return " - " + wrappe.getNombre();
	}
}
