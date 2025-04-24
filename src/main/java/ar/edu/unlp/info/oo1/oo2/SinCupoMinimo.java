package ar.edu.unlp.info.oo2.ejercicio5_10.Ej6;

public class SinCupoMinimo extends State{
	protected String informacionAdicional() {
		return " cantidad de usuarios faltantes para alcanzar el cupo minimo: " + 
				excursion.getCantidadUsuariosFaltantesMinimo();
	}
	
	public void inscribirUsuario(Usuario usuario) {
		excursion.agregarUsuarioInscriptosProvisoriamente(usuario);
	}
}
