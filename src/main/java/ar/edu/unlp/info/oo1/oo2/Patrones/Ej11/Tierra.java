package ar.edu.unlp.info.oo1.oo2.Patrones.Ej11;

public class Tierra implements Topografia{

	public double obtenerProporcionAgua() {
		return 0;
	}

	public double obtenerProporcionTierra() {
		return 1;
	}

	public boolean equal(Topografia otraTopografia) {
		return otraTopografia.equalTierra();
	}

	public boolean equalAgua() {
		return false;
	}

	public boolean equalTierra() {
		return true;
	}

	public boolean equalCompuesta(CeldaCompuesta otraTopografia) {
		return false;
	}
	
}
