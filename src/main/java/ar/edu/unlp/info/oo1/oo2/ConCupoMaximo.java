package ar.edu.unlp.info.oo2.ejercicio5_10.Ej6;

public class ConCupoMaximo extends State{
	protected String informacionAdicional() {
		return "";
	}
	
	public void inscribirUsuario(Usuario usuario) {
		excursion.agregarUsuarioListaEspera(usuario);
	}
}