package ar.edu.unlp.info.oo1.oo2.Patrones.Ej4;

import java.time.LocalTime;

public class Pending extends State{

	public Pending(ToDoItem toDoItem) {
		super(toDoItem);
	}

	public void start() {
		toDoItem.changeState(new inProgress(toDoItem));
	}

	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	public void finish() {
		
	}

	public LocalTime workedTime() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra inicializado");
	}

	public void addComment(String comment) {
		toDoItem.addComment(comment);
	}

}
