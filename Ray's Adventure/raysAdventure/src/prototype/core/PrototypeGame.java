package prototype.core;

import main.Game;
import misc.Tools;
import prototype.being.Alloy;
import prototype.being.Ray;
import prototype.room.EntryRoom;

public class PrototypeGame extends Game {
	
    public void startGame() {
        EntryRoom entryRoom = new EntryRoom();
        BasicBeing ray = entryRoom.getBeings().get(0);
        makeChoice(ray);
        System.out.println("You find yourself waking up on a vacant-looking space ship:");
        System.out.println("You are full of questions, what do you want to do?");
        
             
        System.out.println("That was exciting, thanks for playing!");
    }
    
	public void makeChoice(BasicBeing ray) {
		
        
        /**
         *  if (room.beings() is non-empty){
         *  for loop to interact with beings
         */
          
        
        /**
         *  if (room.items() is non-empty){
         *  for loop to interact with items
         */
        
        
        //choice code below will need to be modified to accomodate beings, doors, items
        
		//condition for breaking the while loop needs to be explored
		
		while(true) {
			System.out.println("What do you want to do?");
			System.out.println("1 - Ask - 'Who am I'");
	        System.out.println("2 - Ask - 'Where am I?'");
	        System.out.println("3 - Inspect the items you are carrying");       
	        System.out.println("4 - Go to another room.");
			
			int choice = Tools.getWholeNumberInput();
			
			if(choice ==1) {
				System.out.println("Your name is " + ray.getName());
			}
			
			else if(choice==2) {
				System.out.println("You see a plaque near the door that says this room is called ");
				ray.getLocation().printName();
				ray.getLocation().printDescription();
			}
			
			// include Nate's Inventory.browseInventory() method
			else if(choice==3) {
				
			}
			
			else if(choice==4) {
				
				if(ray.getLocation().getDoors().size() == 1) {
					System.out.println("You see only 1 door from this room.");
				}
				else {
					System.out.println("You see " + ray.getLocation().getDoors().size() + " doors.");
				}
				System.out.println("Please make a selection.");
				System.out.println("1: Stay in this room.");
				for(int i=0; i < ray.getLocation().getDoors().size(); i++) {
					System.out.print((i+2) + ": ");
					ray.getLocation().getDoors().get(i).printName();
				}
				int temp = 100;
				do {
					temp = Tools.getWholeNumberInput();
				}
				while (temp > (ray.getLocation().getDoors().size() + 1));
				if(temp == 1) {
					continue;
				}
				else {
					ray.changeLocation(ray.getLocation().getDoors().get(temp-2));
				}
				
			}
			
			else {
				System.out.println("You must be confused, that isn't an option.");
			}
		}


	}
}
