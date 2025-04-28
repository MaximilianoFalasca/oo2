package ar.edu.unlp.info.oo1.oo2.Patrones.Ej6;

public class ConCupoMaximo extends State{
	protected String informacionAdicional() {
		return "";
	}
	
	public void inscribirUsuario(Usuario usuario) {
		excursion.agregarUsuarioListaEspera(usuario);
	}
}
