package ar.edu.unlp.info.oo1.oo2.repaso.ej1;

import java.util.List;

public class Twitter {
	private List<Usuario> usuarios;

	public void agregarUsuario(String screenName) {
		Usuario usuario = usuarios.stream().filter(usuarioLista-> usuarioLista.esMiNombre(screenName)).findFirst().orElse(null);
		if(usuario==null) {
			usuario = new Usuario(screenName);
		}
	}
	
	public void eliminarUsuario(Usuario usuario) {
		usuario.eliminar();
		usuarios.remove(usuario);
	}
}
