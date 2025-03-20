package ar.edu.unlp.info.oo1.oo2.repaso.ej1;

import java.util.List;

public class Usuario {
	private String screenName;
	private List<Publicacion> publicaciones;
	
	public Usuario(String screenName) {
		super();
		this.screenName = screenName;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	public void crearTweet(String texto) {
		if(texto.length()>1 || texto.length()<280) {
			publicaciones.add(new Tweet(texto));
		}
	}
	
	public void crearReTweet(Publicacion publicacion) {
		publicaciones.add(new ReTweet(publicacion));
	}
	
	public boolean esMiNombre(String nombre) {
		return nombre.equals(screenName);
	}
	
	public void eliminar() {
		publicaciones.clear();
	}
}