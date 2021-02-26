package prototype.being;
import java.util.ArrayList;

import misc.Tools;
import prototype.core.BasicBeing;
import prototype.items.ConcreteBasicItem;
import prototype.room.EntryRoom;

public class Ray extends BasicBeing {

	private ArrayList<ConcreteBasicItem> inventory;

	public Ray(){
		super("Ray", "Our titular hero.", 100, new EntryRoom());
	}
	
	public void makeChoice() {
		
		int choice; 
		
		do {
			choice = Tools.getWholeNumberInput();
			if(choice ==1) {
				System.out.println("Your name is " + getName());
				
			}
			else if(choice==2) {
				getLocation().printDescription();
			}
			else {
				System.out.println("You must be confused, that isn't an option.");
			}
		}
		while(choice>2);

	}
	
}