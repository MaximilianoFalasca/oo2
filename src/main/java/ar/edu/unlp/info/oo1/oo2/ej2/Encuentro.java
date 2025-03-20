package ar.edu.unlp.info.oo1.oo2.ej2;

import java.util.List;

public class Encuentro {
	private List<Jugador> jugadores;

	public Encuentro(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	// damos por sentado que los encuentros son de a dos jugadores, sino hay que cambiar cosas
	public Jugador ronda(List<Jugador> jugadores) {
		Jugada jugada1 = jugadores.get(0).getJugada();
		Jugada jugada2 = jugadores.get(1).getJugada();
		Jugador ganador = null;
		if(jugada1.ganoContra(jugada2)) {
			ganador = jugadores.get(0);
		}else {
			if(jugada2.ganoContra(jugada1)) {
				ganador = jugadores.get(1);
			}
		}
		return ganador;
		
	}
	
	// si alguno no tiene una jugada el match se tiene que repetir e informar que no se pudo realizar porque un jugador no realizo una jugada
	
	// mientras se repitan los empates y los jugadores realizen jugadas se siguen las rondas
	
	// cuando finaliza una ronda las jugadas se setean en null para saber cuando un jugador no elegio una jugada luego del empate
	public Jugador match() {
		Jugador ganador=null;
		while (jugadores.stream().anyMatch(jugador->jugador.getJugada()==null) && ganador==null) {
			ronda(jugadores);
			jugadores.stream().forEach(jugador->jugador.setJugada(null));
		}
		if(!jugadores.stream().anyMatch(jugador->jugador.getJugada()==null)) {
			System.out.println("No todos los jugadores realizaron una jugada");
		}
		return ganador;
	}
}
