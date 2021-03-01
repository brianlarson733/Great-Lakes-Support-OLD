package prototype.core;
import java.util.*;

public abstract class BasicRoom {

	//Instance Variables for BasicRoom
	public String description;
	public String name;
	public ArrayList items;
	public ArrayList beings;
	public ArrayList doors;

	//Constructor for BasicRoom
	public BasicRoom(String description, String name, ArrayList items, ArrayList beings, ArrayList doors) {
		this.description = description;
		this.name = name;
		this.items = items;
		this.beings = beings;
		this.doors = doors;
	}

	public void printDescription(){
		System.out.println(description);
	}

	public void printName(){
		System.out.println(name);
	}


}
