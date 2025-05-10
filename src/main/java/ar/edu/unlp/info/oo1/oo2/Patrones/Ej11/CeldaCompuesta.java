package ar.edu.unlp.info.oo1.oo2.Patrones.Ej11;

import java.util.ArrayList;
import java.util.List;

public class CeldaCompuesta implements Topografia{
	private List<Topografia> topografias;

	
	public CeldaCompuesta(Topografia t1, Topografia t2, Topografia t3, Topografia t4){
        this.topografias = new ArrayList<Topografia>();
        this.topografias.add(t1);
        this.topografias.add(t2);
        this.topografias.add(t3);
        this.topografias.add(t4);
	}

	public double obtenerProporcionAgua() {
		return topografias.stream().mapToDouble(topografia->topografia.obtenerProporcionAgua()).sum();
	}


	public double obtenerProporcionTierra() {
		return topografias.stream().mapToDouble(topografia->topografia.obtenerProporcionTierra()).sum();
	}


	public boolean equal(Topografia otraTopografia) {
		return otraTopografia.equalCompuesta(this);
	}

	public boolean equalAgua() {
		return false;
	}

	public boolean equalTierra() {
		return false;
	}

	public boolean equalCompuesta(CeldaCompuesta otraTopografia) {
		return topografias.equals(otraTopografia.getTopografias());
	}
	
	public List<Topografia> getTopografias(){
		return topografias;
	}
	
}
