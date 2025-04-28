package ar.edu.unlp.info.oo1.oo2.Patrones.Ej7;

public class Dividiendo extends Estado{

	public Dividiendo(Calculadora calculadora) {
		super(calculadora);
	}

	public String getResultado() {
		return "Se necesita el segundo operando. Valor actual: " + calculadora.getValorActual() + " + ";
	}
	
	public void setValor(Double valor) {
		if(valor == 0) {
			calculadora.changeState(new Error(calculadora));
		}else {
			calculadora.setValorActual(calculadora.getValorActual() / valor);
			calculadora.changeState(new Esperando(calculadora));
		}
	}
	
	public void mas() {
		calculadora.changeState(new Error(calculadora));
	}
	
	public void menos() {
		calculadora.changeState(new Error(calculadora));
	}
	
	public void dividido() {
		calculadora.changeState(new Error(calculadora));
	}
	
	public void por() {
		calculadora.changeState(new Error(calculadora));
	}
	
	public void borrar() {
		calculadora.setValorActual(0.0);
		calculadora.changeState(new Esperando(calculadora));
	}
}
