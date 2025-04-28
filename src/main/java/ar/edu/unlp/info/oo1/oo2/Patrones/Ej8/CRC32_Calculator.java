package ar.edu.unlp.info.oo1.oo2.Patrones.Ej8;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRC_Calculator {
	public long crcFor(String datos) {
		CRC32 crc = new CRC32();
		//String datos = "un mensaje";
		crc.update(datos.getBytes());
		long result = crc.getValue();
		return result;
	}
}
