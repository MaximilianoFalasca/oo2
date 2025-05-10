package ar.edu.unlp.info.oo1.oo2.Patrones.Ej11;

public class Agua implements Topografia{
	public double obtenerProporcionAgua() {
		return 1;
	}

	public double obtenerProporcionTierra() {
		return 0;
	}
	
	public boolean equal(Topografia otraTopografia) {
		return otraTopografia.equalAgua();
	}

	public boolean equalAgua() {
		return true;
	}

	public boolean equalTierra() {
		return false;
	}

	public boolean equalCompuesta(CeldaCompuesta otraTopografia) {
		return false;
	}
	
}
