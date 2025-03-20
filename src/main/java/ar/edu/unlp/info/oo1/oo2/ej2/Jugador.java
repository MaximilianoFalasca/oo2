package ar.edu.unlp.info.oo1.oo2.ej2;

public class Jugador {
	private Jugador rival;
	private Jugada jugada=null;
	
	public Jugador(Jugador rival) {
		this.rival = rival;
	}
	
	public Jugada getJugada() {
		return jugada;
	}

	public void setJugada(Jugada jugada) {
		this.jugada = jugada;
	}
}
