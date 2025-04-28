package ar.edu.unlp.info.oo1.oo2.Patrones.Ej2;

public class Temporario extends Empleado{
	private boolean casado;
	private int cantidadHijos;
	private int cantidadHorasTrabajadas;
	
	public Temporario(boolean casado, int cantidadHijos, int cantidadHorasTrabajadas) {
		super();
		this.casado = casado;
		this.cantidadHijos = cantidadHijos;
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
	}

	@Override
	public int basico() {
		return 20000 + cantidadHorasTrabajadas*300;
	}

	@Override
	public int adicional() {
		int adicional=0;
		if(casado) {
			adicional=5000;
		}
		adicional+=2000*cantidadHijos;
		
		return adicional;
	}

}
