package ar.edu.unlp.info.oo1.oo2.Patrones.Ej7;

public class Esperando extends Estado{

	public Esperando(Calculadora calculadora) {
		super(calculadora);
	}

	public String getResultado() {
		return "Valor actual: " + calculadora.getValorActual();
	}
	
	public void setValor(Double valor) {
		calculadora.setValorActual(valor);
	}
	
	public void mas() {
		calculadora.changeState(new Sumando(calculadora));
	}
	
	public void menos() {
		calculadora.changeState(new Restando(calculadora));
	}
	
	public void dividido() {
		calculadora.changeState(new Dividiendo(calculadora));
	}
	
	public void por() {
		calculadora.changeState(new Multiplicando(calculadora));
	}
	
	public void borrar() {
		calculadora.setValorActual(0.0);
	}
}
