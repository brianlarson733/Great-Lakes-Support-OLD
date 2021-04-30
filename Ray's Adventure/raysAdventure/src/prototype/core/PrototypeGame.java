package prototype.core;

import java.util.Random;
import main.Game;
import misc.Tools;
import prototype.being.Alloy;
import prototype.being.Ray;
import prototype.being.Bug;
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
        Bug bug = new Bug(cargoBay);

		//Update Room Beings List
		entryRoom.beings.add(ray);
		cockpit.beings.add(alloy);	
        cargoBay.getBeings().add(bug);



		//Instantiating Ray's Inventory:
		Inventory rayInventory = new Inventory();
		rayInventory.BasicInventory();

		//Introductory Text
        System.out.println("------------------------------------------------------------");
        System.out.println("You find yourself waking up on a vacant-looking space ship:");
        System.out.println("You are full of questions and your mind feels like its trapped in a fog...");
        System.out.println("Who am I? What is this place?");
		
		while(true){
		System.out.println("------------------------------------------------------------");
		System.out.println("What would you like to do?");
		System.out.println("1 - Ask - 'Who am I'");
		System.out.println("2 - Ask - 'Where am I?'");
		System.out.println("3 - Decide to get up and explore");
		System.out.println();
		int initchoice = Tools.getWholeNumberInput();
		System.out.println();

			if(initchoice ==1) {
					System.out.println("Your name is " + ray.getName() + "\n");
			}
				
			else if(initchoice==2) {
					System.out.println("You slowly start to remember that you were piloting a ship before something caused your ship to crash into this planet.");
					System.out.println("You see a plaque near the door that says this room is called: ");
					ray.getLocation().printName();
					ray.getLocation().printDescription();
					System.out.println();
			}
			
			else if (initchoice==3){
				break;
			}
		}

		makeChoice(ray, alloy, bug, rayInventory);

		//Game Conclusion Text
        System.out.println("That was exciting, thanks for playing!");

    }


	public void makeChoice(Ray ray, Alloy alloy, Bug bug, Inventory rayInventory) {
		
        
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
		
		System.out.println("------------------------------------------------------------");
        System.out.println("You pick yourself up and slowly stare around the room, taking in  your surroundings.");
        
		while(true) {
			
            //If the bug is present, there is a 50% chance the bug will attack Ray
            // each time makeChoice is called
            if (bug.getLocation() == ray.getLocation()) {
                Random rand = new Random();
                int temp = rand.nextInt(2);
                if (temp == 0) {
                    System.out.println("The bug just bit you! Ouch!");
                    ray.changeHealth(-10);
                }
            }
			
			System.out.println("------------------------------------------------------------");
			System.out.println("What do you want to do?");
			System.out.println("1 - Ask - 'What room is this?'");
			System.out.println("2 - Inspect the room");
			System.out.println("3 - Inspect the items you are carrying");
			System.out.println("4 - Go to another room.");


      		// this will print out interaction options if there is another being in the room
	        int choiceNumber = 5;
	        
	        for (int i = 0; i < ray.getLocation().getBeings().size(); i++) {
	        	// make sure we only try to interact with a being that isn't Ray
	        	if(!(ray.getLocation().getBeings().get(i) instanceof Ray)) {
	        		System.out.println(choiceNumber + " - Interact with " + 
	        				ray.getLocation().getBeings().get(i).getName());
	        		choiceNumber++;
	        	}
	        System.out.println();
	     
	        		
	        }
			System.out.println();
			int choice = Tools.getWholeNumberInput();
			System.out.println();
						
			if(choice==1) {
				System.out.println("You see a plaque near the door that says this room is called ");
				ray.getLocation().printName();
				ray.getLocation().printDescription();
				System.out.println();
			}

			//Displays the contents of the room's inventory
			//This needs to somehow determine both Ray's location and call the array for that location
			else if(choice==2) {
				System.out.println("This room contains:");
				for (int i = 0; i < ray.getLocation().items.size(); i++) {
					System.out.print("    ");

					//This is a debugging print and won't be needed later on if we can work out
					//how to safely implement an inventory management system that takes
					//into account arrays starting with 0
					System.out.print(i + ": ");

					//This prints out the item at the i location
					System.out.println(ray.getLocation().items.get(i));
				}

				//rayInventory.InventoryList();
				System.out.println();
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
					System.out.println();
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
					
                    // move Alloy with Ray if Alloy is in the same room and if stayPut is false
					if (alloy.getLocation().equals(tempRoom)) {
						if(!alloy.getStayPut()) {
							alloy.changeLocation(ray.getLocation());
							tempRoom.removeBeing(alloy);
							ray.getLocation().addBeing(alloy);
						}
					}
					
                    // move the bug with Ray if the bug is in the same room
                    if (bug.getLocation().equals(tempRoom)) {
                        bug.changeLocation(ray.getLocation());
                        tempRoom.removeBeing(bug);
                        ray.getLocation().addBeing(bug);
                        System.out.println("How frightening! The bug followed you through the door!");
                        
                    }
				}
			}
			
			// check if the choice is to interact with the other being
			else if(choice <= choiceNumber) {
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
