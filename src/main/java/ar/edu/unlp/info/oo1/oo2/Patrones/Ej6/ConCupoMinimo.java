package ar.edu.unlp.info.oo1.oo2.Patrones.Ej6;

public class ConCupoMinimo extends State{
	protected String informacionAdicional() {
		return " los mails de los usuarios son: " + excursion.getMails() +
				" cantidad de usuarios faltantes para alcanzar el cupo maximo: " + 
				excursion.getCantidadUsuariosFaltantesMaximo();
	}
	
	public void inscribirUsuario(Usuario usuario) {
		excursion.agregarUsuarioInscriptos(usuario);
	}
}
