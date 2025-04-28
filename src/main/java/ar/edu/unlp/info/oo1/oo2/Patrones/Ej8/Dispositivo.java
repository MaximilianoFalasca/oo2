package ar.edu.unlp.info.oo1.oo2.Patrones.Ej8;

public class Dispositivo {
	private Ringer ringer;
	private CRC_Calculator crcCalculator;
	private Display display;
	private Connection connection;
	
	public Dispositivo(Ringer ringer, CRC_Calculator calculator, Display display, Connection connection) {
		super();
		this.ringer = ringer;
		this.crcCalculator = calculator;
		this.display = display;
		this.connection = connection;
	}

	public void configurarCRC(CRC_Calculator calculator) {
		this.crcCalculator = calculator;
	}

	public void conectarCon(Connection connection) {
		this.connection = connection;
		System.out.println(connection.pict());
		ringer.ring();
	}
	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data,crc);
	}
}
