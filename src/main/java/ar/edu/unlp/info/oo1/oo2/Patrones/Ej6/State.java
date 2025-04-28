package ar.edu.unlp.info.oo1.oo2.Patrones.Ej6;

public abstract class State {
	protected Excursion excursion;
	
	public String mostrarInformacion() {
		return "nombre: " + excursion.getNombre() +
				" costo: " + excursion.getCosto() +
				" fecha de inicio: " + excursion.getFechaInicio() +
				" fecha de fin: " + excursion.getFechaFin() + 
				" punto de encuentro: " +  excursion.getPuntoEncuentro()+
				informacionAdicional();
	}
	
	protected abstract String informacionAdicional();
	
	abstract public void inscribirUsuario(Usuario usuario);
}