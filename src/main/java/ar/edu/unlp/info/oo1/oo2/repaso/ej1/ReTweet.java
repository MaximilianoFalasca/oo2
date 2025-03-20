package ar.edu.unlp.info.oo1.oo2.repaso.ej1;

public class ReTweet implements Publicacion{
	private Publicacion Tweet;
	
	public ReTweet(Publicacion tweet) {
		super();
		Tweet = tweet;
	}

	public String getTexto() {
		return Tweet.getTexto();
	}
}
