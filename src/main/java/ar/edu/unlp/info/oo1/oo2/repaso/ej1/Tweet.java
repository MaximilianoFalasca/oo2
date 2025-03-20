package ar.edu.unlp.info.oo1.oo2.repaso.ej1;

public class Tweet implements Publicacion{
	private String texto;
	
	public Tweet(String texto) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}
