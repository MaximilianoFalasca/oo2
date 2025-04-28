package ar.edu.unlp.info.oo1.oo2.Patrones.Ej7;

public class Error extends Estado{
	public Error(Calculadora calculadora) {
		super(calculadora);
	}

	public String getResultado() {
		return "Error: no se pudo realizar la operacion, reinicie pulsando 'borrar'";
	}
	
	public void setValor(Double valor) {
		System.out.println(getResultado());
	}
	
	public void mas() {
		System.out.println(getResultado());
	}
	
	public void menos() {
		System.out.println(getResultado());
	}
	
	public void dividido() {
		System.out.println(getResultado());
	}
	
	public void por() {
		System.out.println(getResultado());
	}
	
	public void borrar() {
		calculadora.changeState(new Esperando(calculadora));
	}
}
