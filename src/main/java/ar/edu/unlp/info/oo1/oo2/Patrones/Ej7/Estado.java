package ar.edu.unlp.info.oo1.oo2.Patrones.Ej7;

public abstract class Estado {
	protected Calculadora calculadora;
	
	public Estado(Calculadora calculadora) {
		super();
		this.calculadora = calculadora;
	}
	
	abstract public String getResultado();
	abstract public void borrar();
	abstract public void setValor(Double valor);
	abstract public void mas();
	abstract public void menos();
	abstract public void dividido();
	abstract public void por();
}
