package prototype.core;

import main.Game;
import misc.Tools;
import prototype.being.Alloy;
import prototype.being.Ray;
import prototype.items.Inventory;
import prototype.room.*;

public class PrototypeGame extends Game {
	
    public void startGame() {
		//Create Rooms
        EntryRoom entryRoom = new EntryRoom();
        CockpitRoom cockpit = new CockpitRoom();
		EngineRoom engineRoom = new EngineRoom();
		CargoRoom cargoBay = new CargoRoom();

		//Create Layout
		entryRoom.doors.add(cockpit);
		entryRoom.doors.add(engineRoom);
		entryRoom.doors.add(cargoBay);
		cockpit.doors.add(entryRoom);
		engineRoom.doors.add(entryRoom);
		cargoBay.doors.add(entryRoom);
		cargoBay.doors.add(engineRoom);
		engineRoom.doors.add(cargoBay);

		//Create and Place Beings
		Ray ray = new Ray(entryRoom);
		Alloy alloy = new Alloy(cockpit);

		//Update Room Beings List
		entryRoom.beings.add(ray);
		cockpit.beings.add(alloy);		


		//Instantating Ray's Inventory:
		Inventory rayInventory = new Inventory();
		rayInventory.BasicInventory();

		//Introductory Text
        System.out.println("------------------------------------------------------------");
        System.out.println("You find yourself waking up on a vacant-looking space ship:");
        System.out.println("You are full of questions, what do you want to do?");
        System.out.println("------------------------------------------------------------");
             

		makeChoice(ray, alloy, rayInventory);

		//Game Conclusion Text
        System.out.println("That was exciting, thanks for playing!");

    }


	public void makeChoice(Ray ray, Alloy alloy, Inventory rayInventory) {
		
        
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
	        System.out.println("4 - Go to another room. \n");
	        
	        int choiceNumber = 5;
	        
	        // this will print out interaction options if there is another being in the room
	        for (int i = 0; i < ray.getLocation().getBeings().size(); i++) {
	        	// make sure we only try to interact with a being that isn't Ray
	        	if(!(ray.getLocation().getBeings().get(i) instanceof Ray)) {
	        		System.out.println(choiceNumber + " - Interact with " + 
	        				ray.getLocation().getBeings().get(i).getName());
	        		choiceNumber++;
	        	}
	     
	        		
	        }
			
			int choice = Tools.getWholeNumberInput();
			
			if(choice ==1) {
				System.out.println("Your name is " + ray.getName());
			}
			
			else if(choice==2) {
				System.out.println("You see a plaque near the door that says this room is called ");
				ray.getLocation().printName();
				ray.getLocation().printDescription();
			}
			
			// Displays the contents of Ray's inventory.
			else if(choice==3) {
				rayInventory.InventoryList();
				System.out.println();
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
					BasicRoom tempRoom = ray.getLocation();
					ray.changeLocation(ray.getLocation().getDoors().get(temp-2));
					tempRoom.removeBeing(ray);
					ray.getLocation().addBeing(ray);
					
					if (alloy.getLocation().equals(tempRoom)) {
						if(!alloy.getStayPut()) {
							alloy.changeLocation(ray.getLocation());
							tempRoom.removeBeing(alloy);
							ray.getLocation().addBeing(alloy);
					}
					
							
					}
				}
			}
			
			// check if the choice is to interact with the other being
			else if(choice <= 4+ray.getLocation().getBeings().size()-1) {
				// don't interact with Ray in the room's being list
				if(ray.getLocation().getBeings().get(choice-5) instanceof Ray) {
					ray.getLocation().getBeings().get(choice-4).interact();
				}
				else {
					ray.getLocation().getBeings().get(choice-5).interact();
				}
				
			}
			
			
			else {
				System.out.println("You must be confused, that isn't an option.");
			}
		}


	}
}
