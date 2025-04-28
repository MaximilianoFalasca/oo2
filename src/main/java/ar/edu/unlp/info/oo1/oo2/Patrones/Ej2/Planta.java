package ar.edu.unlp.info.oo1.oo2.Patrones.Ej2;

public class Planta extends Empleado{
	private boolean casado;
	private int cantidadHijos;
	private int anioAntiguedad;

	public Planta(boolean casado, int cantidadHijos, int anioAntiguedad) {
		super();
		this.casado = casado;
		this.cantidadHijos = cantidadHijos;
		this.anioAntiguedad = anioAntiguedad;
	}

	@Override
	public int basico() {
		return 50000;
	}

	@Override
	public int adicional() {
		int adicional=0;
		if(casado) {
			adicional=5000;
		}
		adicional+=2000*cantidadHijos;
		adicional+=2000*anioAntiguedad;
		
		return adicional;
	}
}
