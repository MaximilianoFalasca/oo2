package ar.edu.unlp.info.oo1.oo2.Patrones.Ej7;

public class Calculadora {
	private Estado estado;
	private Double valorActual;
	
	public Calculadora() {
		estado = new Esperando(this);
	}
	
	public void changeState(Estado estado) {
		this.estado = estado;
	}
	
	public Double getValorActual() {
		return valorActual;
	}
	
	public void setValorActual(Double valor) {
		valorActual = valor;
	}
	
	public String getResultado() {
		return estado.getResultado();
	}
	
	public void setValor(Double valor) {
		estado.setValor(valor);
	}
	
	public void mas() {
		estado.mas();
	}
	
	public void menos() {
		estado.menos();
	}
	
	public void dividido() {
		estado.dividido();
	}
	
	public void por() {
		estado.por();
	}
	
	public void borrar() {
		estado.borrar();
	}
}
