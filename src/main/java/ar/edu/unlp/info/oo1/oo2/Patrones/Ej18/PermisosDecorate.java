package ar.edu.unlp.info.oo1.oo2.Patrones.Ej18;

public class PermisosDecorate extends FileManager {
	public PermisosDecorate(File file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return " - " + wrappe.getPermisos();
	}
}
