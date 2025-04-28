package ar.edu.unlp.info.oo1.oo2.Patrones.Ej4;

import java.time.LocalTime;

public abstract class State {
	protected ToDoItem toDoItem;
	
	public State(ToDoItem toDoItem) {
		super();
		this.toDoItem = toDoItem;
	}
	public abstract void start();
	public abstract void togglePause();
	public abstract void finish();
	public abstract LocalTime workedTime();
	public abstract void addComment(String comment);
}
