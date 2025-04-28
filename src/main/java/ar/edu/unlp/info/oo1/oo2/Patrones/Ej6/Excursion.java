package ar.edu.unlp.info.oo1.oo2.Patrones.Ej6;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Excursion {
	private String nombre, puntoEncuentro;
	private LocalDate fechaInicio, fechaFin;
	private int cupoMinimo,cupoMaximo,costo;
	private State state;
	private List<Usuario> usuariosInscriptos, usuariosInscriptosProvisoriamente, listaEspera;
	
	public Excursion(String nombre, String puntoEncuentro, LocalDate fechaInicio, LocalDate fechaFin, int cupoMinimo,
			int cupoMaximo, int costo, State state) {
		super();
		this.nombre = nombre;
		this.puntoEncuentro = puntoEncuentro;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.costo = costo;
		this.state = state;
		usuariosInscriptos = new ArrayList<Usuario>();
		usuariosInscriptosProvisoriamente = new ArrayList<Usuario>();
		listaEspera = new ArrayList<Usuario>();
	}

	public void changeState(State state) {
		this.state = state;
	}
	
	public String mostrarInformacion() {
		return state.mostrarInformacion();
	}

	public String getNombre() {
		return nombre;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public int getCosto() {
		return costo;
	}
	
	public int getCantidadUsuariosFaltantesMinimo() {
		return cupoMinimo - usuariosInscriptosProvisoriamente.size();
	}
	
	public int getCantidadUsuariosFaltantesMaximo() {
		return cupoMaximo - usuariosInscriptos.size();
	}
	
	public List<String> getMails(){
		return usuariosInscriptos.stream().map(usuario-> usuario.getMail()).collect(Collectors.toList());
	}
	
	public void inscribirUsuario(Usuario usuario) {
		state.inscribirUsuario(usuario);
	}

	public void agregarUsuarioInscriptos(Usuario usuario) {
		usuariosInscriptos.add(usuario);
	}

	public void agregarUsuarioInscriptosProvisoriamente(Usuario usuario) {
		usuariosInscriptosProvisoriamente.add(usuario);
	}

	public void agregarUsuarioListaEspera(Usuario usuario) {
		listaEspera.add(usuario);
	}
}
