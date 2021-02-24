import java.util.*;

public abstract class BasicRoom {

	//Instance Variables for BasicRoom
	public String description;
	public String name;
	public String entryNarration;

	//Constructor for BasicRoom
	public BasicRoom(String description, String name, String entryNarration) {
		this.description = description;
		this.name = name;
		this.entryNarration = entryNarration;
	}

	public void printDescription(){
		System.out.println(description);
	}

	public void printName(){
		System.out.println(name);
	}

	public void printEntryNarration(){
		System.out.println(entryNarration);
	}



}
