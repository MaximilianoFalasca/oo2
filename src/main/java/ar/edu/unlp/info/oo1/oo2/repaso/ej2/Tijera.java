package ar.edu.unlp.info.oo1.oo2.repaso.ej2;

public class Tijera implements Jugada{
	@Override
	public boolean ganoContra(Jugada jugada) {
		return jugada instanceof Papel;
	}
}
