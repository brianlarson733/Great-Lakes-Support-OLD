package prototype.core;
import java.util.*;

public abstract class BasicRoom {

	//Instance Variables for BasicRoom
	public String description;
	public String name;
	public String entryNarration;

	//Constructor for BasicRoom
	public BasicRoom(String description, String name) {
		this.description = description;
		this.name = name;
	}

	public void printDescription(){
		System.out.println(description);
	}

	public void printName(){
		System.out.println(name);
	}


}
