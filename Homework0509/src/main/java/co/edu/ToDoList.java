package co.edu;

public class ToDoList {

	
	private String toDo;

	public ToDoList() {}
	
	
	public ToDoList(String toDo) {
		super();
		this.toDo = toDo;
	}

	public String getToDo() {
		return toDo;
	}

	public void setToDo(String toDo) {
		this.toDo = toDo;
	}

	@Override
	public String toString() {
		return "ToDoList [toDo=" + toDo + "]";
	}
	
	
}
