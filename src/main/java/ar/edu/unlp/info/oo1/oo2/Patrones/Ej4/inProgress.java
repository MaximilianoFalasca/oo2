package ar.edu.unlp.info.oo1.oo2.Patrones.Ej4;

import java.time.LocalTime;

public class inProgress  extends State{

	public inProgress(ToDoItem toDoItem) {
		super(toDoItem);
	}

	public void start() {
		
	}

	public void togglePause() {
		toDoItem.changeState(new Paused(toDoItem));
	}

	public void finish() {
		toDoItem.changeState(new Finished(toDoItem));
	}

	//simulando el tiempo que paso desde que se inicio
	public LocalTime workedTime() {
		return null;
	}

	public void addComment(String comment) {
		toDoItem.addComment(comment);
	}

}
