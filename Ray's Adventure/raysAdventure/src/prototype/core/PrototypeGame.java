package prototype.core;

import java.util.Random;
import java.util.Scanner;

import main.Game;
import misc.Tools;
import prototype.being.Alloy;
import prototype.being.Ray;
import prototype.being.Bug;
import prototype.items.ConcreteBasicItem;
import prototype.items.Inventory;
import prototype.room.*;

public class PrototypeGame extends Game {
	
	//end game condition
	public static boolean endGame = false;

	/**
	 * This method is called to start the game
	 */
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

		//Instantiating Room Inventories:
		ConcreteBasicItem cockpitPamphlet = new ConcreteBasicItem("Colorful folded paper","Pamphlet for the DXP Diamond Bar");
		ConcreteBasicItem cockpitSnack = new ConcreteBasicItem("Hard candies in various shades of blue","DXP Diamond Bar Snacks!");
		ConcreteBasicItem cockpitBlank = new ConcreteBasicItem("This is an empty space", "Empty Space");
		cockpit.items.add(cockpitBlank);
		cockpit.items.add(cockpitPamphlet);
		cockpit.items.add(cockpitSnack);

		//Introductory Text
        System.out.println("------------------------------------------------------------");
        System.out.println("");
        System.out.println("You find yourself waking up on a vacant-looking space ship..." + 
        		"what were you\ndoing here, again? You see the name 'Ray' printed on your" +
        		" spacesuit. As you\nlook around, you see a plaque above a door calling" +
        		" this space 'Entry Room'.\nThis doesn't satisfy your questions though...");
        
        //this starts the command line interactions with the player
		makeChoice(ray, alloy, bug, rayInventory);

    }

    /**
	 * This method is called to end the game
	 * @param being is the being that just died, determining how the game ends
	 */
	public static void endGame(BasicBeing being) {
		if(being instanceof Ray) {
			System.out.println("How sad, Ray's space adventures have come to an end!");			
		}
		else if(being instanceof Bug) {
			System.out.println("Our hero has saved the day, hurrah!");
			System.out.println("Now work can begin on all those ship feature"
					+ " requests you've been receiving from Alloy...");
		}
		endGame = true;
	}
	
	/**
	 * This provides transition text for easier reading
	 */
	public static void transitionText() {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Press 'Enter' to continue");
		scan.nextLine();
		
	}

	/**
	 * This allows the user to make choices and advance through the game
	 */
	public void makeChoice(Ray ray, Alloy alloy, Bug bug, Inventory rayInventory) {
		
		//this forever loop ensures the game continually presents choices to the user
		while(true) {

			//If the bug is present, there is a 50% chance the bug will attack either
			// Ray or Alloy each time makeChoice is called
			if (bug.getLocation() == ray.getLocation()) {
				Random rand = new Random();
				//decide if the bug will attack
				if (rand.nextInt(2) == 0) {
					//decide if it will attack Ray or Alloy
					if (alloy.getLocation() == ray.getLocation()) {
						if (rand.nextInt(2) == 0) {
							System.out.println("The bug just bit you! Ouch!");
							ray.changeHealth(-10);
						} else {
							System.out.println("The bug just bit Alloy! Ouch!");
							alloy.changeHealth(-10);
						}

					} else {
						System.out.println("The bug just bit you! Ouch!");
						ray.changeHealth(-10);
					}
					transitionText();
				}

				//the game will end if endGame is true
				if (endGame) {
					break;
				}

			}

			System.out.println();
			System.out.println("You are in the " + ray.getLocation().getName() + ".");
			System.out.println();
			System.out.println("What do you want to do?");
			System.out.println();
			System.out.println("1 - Inspect the room");
			System.out.println("2 - Inspect the items you are carrying");
			System.out.println("3 - Go to another room.");

			// this will print out interaction options if there is another being in the room
			int choiceNumber = 4;
			int offset = choiceNumber;

			for (int i = 0; i < ray.getLocation().getBeings().size(); i++) {
				// make sure we only try to interact with a being that isn't Ray
				if (!(ray.getLocation().getBeings().get(i) instanceof Ray)) {
					System.out.println(choiceNumber + " - Interact with " +
							ray.getLocation().getBeings().get(i).getName());
					choiceNumber++;
				}
			}

			System.out.println();
			int choice = Tools.getWholeNumberInput();
			System.out.println();


			//Displays the contents of the room's inventory
			//This needs to somehow determine both Ray's location and call the array for that location
			if (choice == 1) {
				System.out.println("This room contains:");
				for (int i = 1; i < ray.getLocation().items.size(); i++) {
					System.out.print("    ");

					//This is a debugging print and won't be needed later on if we can work out
					//how to safely implement an inventory management system that takes
					//into account arrays starting with 0
					System.out.print(i + ": ");

					//This prints out the item at the i location
					System.out.println(ray.getLocation().items.get(i));
				}

				System.out.println("Would you like to pick up or drop an item?");
				System.out.println("1. Pick up");
				System.out.println("2. Drop");
				System.out.println("3. No");
				int itemChoice = Tools.getWholeNumberInput();
				//Moving an item from the room's inventory to Ray's inventory
				if (itemChoice == 1) {
					Inventory.InventoryPickup(ray, rayInventory);
				} else if (itemChoice == 2) {
					Inventory.InventoryDrop(ray, rayInventory);
				}
			}
			
			// Displays the contents of Ray's inventory.
			else if (choice == 2) {
					rayInventory.InventoryList();
					System.out.println();
				}
			
			else if(choice==3) {
				
				ray.goToAnotherRoom(alloy, bug);
				
			}
			
			// check if the choice is to interact with the other being
			else if(choice <= choiceNumber) {
				System.out.println("choice is" + " " + choice);
				System.out.println("choiceNumber is" + " " + choiceNumber);
				// don't interact with Ray in the room's being list
				if(ray.getLocation().getBeings().get(choice-offset) instanceof Ray) {
					System.out.println("here");
					ray.getLocation().getBeings().get(choice-offset+1).interact();
				}
				else {
					ray.getLocation().getBeings().get(choice-offset).interact();
				}

			}
			
			else {
					System.out.println("You must be confused, that isn't an option.");
			}
		}
	}

}

