package prototype.being;
import java.util.ArrayList;

import misc.Tools;
import prototype.core.BasicBeing;
import prototype.core.BasicItem;
import prototype.items.ConcreteBasicItem;
import prototype.room.EntryRoom;

public class Ray extends BasicBeing {

	//to be included in Nate's Inventory class
	//private ArrayList<BasicItem> inventory;

	public Ray(){
		super("Ray", "Our titular hero.", 100, new EntryRoom());
	}
	
	public void makeChoice() {
		
	
        System.out.println("1 - Ask - 'Who am I'");
        System.out.println("2 - Ask - 'Where am I?'");
        System.out.println("3 - Inspect the items you are carrying");
        System.out.println("4 - Enter through the door you see ahead.");
        
        /**
         *  if (room.beings() is non-empty){
         *  for loop to interact with beings
         */
        
        /**
         *  if (room.doors() is non-empty){
         *  for loop to add choices to move through doors
         */    
        
        /**
         *  if (room.items() is non-empty){
         *  for loop to interact with items
         */
        
        
        //choice code below will need to be modified to accomodate beings, doors, items
        
		//condition for breaking the while loop needs to be explored
		
		while(true) {
		
			int choice = Tools.getWholeNumberInput();
			
			if(choice ==1) {
				System.out.println("Your name is " + getName());
			}
			
			else if(choice==2) {
				System.out.println("You see a plaque near the door that says this room is called ");
				getLocation().printName();
				getLocation().printDescription();
			}
			
			// include Nate's Inventory.browseInventory() method
			else if(choice==3) {
				
			}
			
			else if(choice==4) {
			//changeLocation(getLocation().getDoors());
				break;
			}
			
			else {
				System.out.println("You must be confused, that isn't an option.");
			}
		}


	}
	
}