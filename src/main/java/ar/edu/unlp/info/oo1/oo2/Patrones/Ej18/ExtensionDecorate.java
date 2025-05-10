package ar.edu.unlp.info.oo1.oo2.Patrones.Ej18;

public class ExtensionDecorate extends FileManager {
	public ExtensionDecorate(File file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return " - " + wrappe.getExtension();
	}
}
