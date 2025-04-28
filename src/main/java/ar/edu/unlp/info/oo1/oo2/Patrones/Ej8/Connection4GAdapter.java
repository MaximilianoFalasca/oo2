package ar.edu.unlp.info.oo1.oo2.Patrones.Ej8;

public class Connection4GAdapter implements Connection{
	private Connection4G connection;
	
	public String sendData(String data, long crc) {
		return connection.transmit(data, crc);
	}

	public String pict() {
		return connection.getSymb();
	}
	
}
