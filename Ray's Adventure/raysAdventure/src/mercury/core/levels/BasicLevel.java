package mercury.core;

import java.util.Random;
import java.util.Scanner;

import main.Game;
import misc.Tools;
import mercury.being.*;
import mercury.items.*;
import mercury.room.*;

public abstract class BasicLevel {
	
	//end game condition
	public boolean endLevel;
	public boolean userWins;

	//constructor for BasicLevel
	public BasicLevel(){
		this.endLevel = false;
		this.userWins = false;
	}

	/**
	 * This method is called to start the Level
	 */
    public abstract void startLevel() {

    }

    /**
	 * This method is called to end the game
	 */
	public static void endLevel(boolean endLevel, boolean userWins) {
		if(userWins == true){
			System.out.println("Success! You've completed this level!");
			System.out.println("Please save the following Code to move on to the next level.")
			System.out.println("You can also use this code to return to the next level the next time you start the game")
			System.out.println(MercuryGame.levelCodes[levelChoice - 1]);
			transitionText();
			MercuryGame.levelSelector();
		}
		else {
			System.out.println("Oh no! You've suffered a mortal wound! As the world fades to black, your last thought is,"
				+ " 'Maybe I shoul'dve commited my code more regularly...'");
			System.out.println("How sad, Ray's space adventures have come to an end!");			
			endLevel = true;
		}

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
	public void makeDecision(Ray ray) {		
		while(!endLevel){


			System.out.println();
			System.out.println("You are in the " + ray.getLocation().getName() + ".");
			System.out.println();
			System.out.println("What do you want to do?");
			System.out.println();
			String[] choices = {"Inspect the room", "Inspect the items you are carrying", "Go to another room"};

			// this will print out interaction options if there is another being in the room
			if(ray.getLocation().getBeings().size() > 1 ){
				String[] choices = {"Inspect the room", "Inspect the items you are carrying", "Go to another room","Interact with beings in the room"};	
			}

			System.out.println();
			int choice = Tools.getWholeNumberInput(choices);
			System.out.println();


			//Displays the contents of the room's inventory
			//This needs to somehow determine both Ray's location and call the array for that location
			if (choice == 1) {
				System.out.println("This room contains:");
				if(ray.getLocation().items.size() == 0){
					System.out.println("Nothing!");
					transitionText();
				}
				else{
					for (int i = 0; i < ray.getLocation().items.size(); i++) {
						int num = i+1;
						System.out.print(num + ": ");

						//This prints out the item at the i location
						System.out.println(ray.getLocation().items.get(i));
					}

					transitionText();
			        System.out.println();
					System.out.println("Would you like to do something with one of the items in the room?");
					String[] itemChoices = {"Pick up","Drop", "No"};
					int itemChoice = Tools.getWholeNumberInput(itemChoices);
					//Moving an item from the room's inventory to Ray's inventory
					if (itemChoice == 1) {
						Ray.InventoryPickup(ray, rayInventory);
					} else if (itemChoice == 2) {
						Ray.InventoryDrop(ray, rayInventory);
					}
				}

			}
			
			// Displays the contents of Ray's inventory.
			else if (choice == 2) {
					Ray.InventoryList();
					System.out.println();
					transitionText();
				}
			
			else if(choice==3) {
				
				ray.goToAnotherRoom(alloy, bug);
				
			}

			// check if the choice is to interact with the other being
			else if(choice == 4) {
				

				if(ray.getLocation().getBeings().get(choice-offset) instanceof Ray) {

					ray.getLocation().getBeings().get(choice-offset+1).interact();
				}
				else {
					ray.getLocation().getBeings().get(choice-offset).interact();
				}

			}
			
			else {
				System.out.println("You must be confused, that isn't an option.");
				PrototypeGame.transitionText();
			}




		}
	}

}

