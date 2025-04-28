package ar.edu.unlp.info.oo1.oo2.Patrones.Ej8;

public class Connection4G {
	private String symb = "Se conecto a red 4G";
	
	public String transmit(String data, long crc) {
		return "Se envian los datos por 4G";
	}

	public String getSymb() {
		return symb;
	}
}
