package ar.edu.unlp.info.oo1.oo2.Patrones.Ej4;

import java.time.LocalTime;

public class ToDoItem {
	private String name;
	private State state;
	
	public ToDoItem(String name, State state) {
		super();
		this.name = name;
		this.state = state;
	}
	
	public void changeState(State state) {
		this.state = state;
	}
	
	public void start() {
		state.start();
	}
	
	public void togglePause() {
		state.togglePause();
	}
	
	public void finish() {
		state.finish();
	}
	
	public LocalTime workedTime() {
		return state.workedTime();
	}
	
	public void addComment(String comment) {
		state.addComment(comment);
	}
}
