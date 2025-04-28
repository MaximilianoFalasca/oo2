package ar.edu.unlp.info.oo1.oo2.Patrones.Ej4;

import java.time.LocalTime;

public class Finished extends State{

	public Finished(ToDoItem toDoItem) {
		super(toDoItem);
		// TODO Auto-generated constructor stub
	}

	public void start() {
		
	}

	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	public void finish() {
		toDoItem.changeState(new Finished(toDoItem));
	}

	//simulando el tiempo que paso desde que se inicio
	public LocalTime workedTime() {
		return null;
	}

	public void addComment(String comment) {
		
	}
}
