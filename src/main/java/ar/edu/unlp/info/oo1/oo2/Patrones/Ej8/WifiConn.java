package ar.edu.unlp.info.oo1.oo2.Patrones.Ej8;

public class WifiConn implements Connection{
	private String pict = "Se conecto a una red wifi";

	public String sendData(String data, long crc) {
		return "Se envian los datos por wifi";
	}
	
	public String pict() {
		return pict;
	}
}
