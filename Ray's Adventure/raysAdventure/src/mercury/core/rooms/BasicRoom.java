package mercury.core.rooms;

import java.util.*;

import mercury.core.beings.BasicBeing;
import mercury.core.beings.Ray;
import mercury.core.items.BasicItem;

public abstract class BasicRoom {
	
	public ArrayList<BasicItem> items;
	public ArrayList<BasicBeing> beings;
	private ArrayList<BasicRoom> doors;
	private String description = "";
	private String name = "";
	
	public BasicRoom(ArrayList<BasicItem> items, ArrayList<BasicBeing> beings, ArrayList<BasicRoom> doors, 
			String description, String name) {
		this.items=items;
		this.beings=beings;
		this.doors=doors;
		setDescription(description);
		setName(name);
	}
	
	public BasicItem getItem(int index) {
		return items.get(index);
	}
	public void addItem(BasicItem item) {
		this.items.add(item);
	}
	public void removeItem(int index) {
		this.items.remove(index);
	}
	public void removeItem(BasicItem item) {
		this.items.remove(item);
	}
	
	public int getItemsSize(){
		return this.items.size();
	}
	
	public void printItems() {
        System.out.println("This room contains:");
		for (int i = 0; i < items.size(); i++) {
			System.out.println((i+1) + ") " + items.get(i).name + ": " + items.get(i).description);
		}
	}
	
	public void printBeings() {
        if (beings.size()==1) {
        	System.out.println("You are the only one in the room.");
        }
        else {
        	System.out.println("You see in the room:");
        	for (int i = 0; i < beings.size(); i++) {
    			if(!(beings.get(i) instanceof Ray))
    				System.out.println(beings.get(i).name);
    		}
        }
	}
	
	public BasicBeing getBeing(int index) {
		return beings.get(index);
	}
	public void addBeing(BasicBeing being) {
		this.beings.add(being);
	}
	public void removeBeing(BasicBeing being) {
		this.beings.remove(being);
	}
	
	public BasicRoom getDoor(int index) {
		return doors.get(index);
	}

	public ArrayList<BasicRoom> getDoors() {
		return this.doors;
	}

	public void addDoor(BasicRoom room) {
		this.doors.add(room);
	}
	public void removeDoor(BasicRoom room) {
		this.doors.remove(room);
	}
	
	public String getDescription() {
		return this.description;
	}
	public void printDescription() {
		System.out.print(description);
	}
	public void setDescription(String description) {
		this.description = description;
	}

  public String getName() {
		return this.name;
	}
	public void printName() {
		System.out.print(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
