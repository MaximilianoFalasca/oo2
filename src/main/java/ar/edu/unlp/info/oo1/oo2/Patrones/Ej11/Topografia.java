package ar.edu.unlp.info.oo1.oo2.Patrones.Ej11;

public interface Topografia {
	public double obtenerProporcionAgua();
	public double obtenerProporcionTierra();
	public boolean equal(Topografia otraTopografia);
	public boolean equalAgua();
	public boolean equalTierra();
	public boolean equalCompuesta(CeldaCompuesta otraTopografia);
}
