package mercury.core.levels;

import java.util.Random;
import java.util.Scanner;

import main.Game;
import misc.Tools;
import mercury.core.MercuryGame;
import mercury.core.beings.*;
import mercury.core.items.*;
import mercury.core.rooms.*;

public abstract class BasicLevel {
	
	//end game condition
	public static boolean endLevel;
	public boolean userWins;
	public int levelCode;

	//constructor for BasicLevel
	public BasicLevel(int levelCode){
		this.endLevel = false;
		this.userWins = false;
		this.levelCode = levelCode;
	}

	/**
	 * This method is called to start the Level
	 */
    public abstract void startLevel();

    /**
	 * This method is called to end the game
	 */
	public static void endLevel(boolean endLevel, boolean userWins, int levelCode) {
		if(userWins == true){
			System.out.println("Success! You've completed this level!");
			System.out.println("Please save the following Code to move on to the next level.");
			System.out.println("You can also use this code to return to the next level the next time you start the game");
			System.out.println(levelCode + "");
			transitionText();
			MercuryGame.levelSelector();
		}
		else {
			System.out.println("Oh no! You've suffered a mortal wound! As the world fades to black, your last thought is,"
				+ " 'Maybe I should've commited my code more regularly...'");
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
	public static void makeDecision(Ray ray) {		
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
					String[] itemChoices = {"Pick up an Item", "No"};
					int itemChoice = Tools.getWholeNumberInput(itemChoices);
					//Moving an item from the room's inventory to Ray's inventory
					if (itemChoice == 1) {
						Ray.pickUpItem(ray.getLocation());
					}
				}

			}
			
			// Displays the contents of Ray's inventory.
			else if (choice == 2) {
					Ray.inspectInventory();
					System.out.println();
					transitionText();
					System.out.println();

					if(ray.rayInventory.size() != 0){
						System.out.println("Would you like to do something with one of the items in your inventory?");
						String[] itemChoices = {"Drop an Item", "Use an Item","No"};
						int itemChoice = Tools.getWholeNumberInput(itemChoices);
						if(itemChoice == 1){
							Ray.dropItem(ray.getLocation());
						}else if(itemChoice == 2){
							Ray.useItem(ray.getLocation());
						}
					}
				}
			
			else if(choice == 3) {
				//method to inspect doors in the room
				System.out.println();
				transitionText();
				System.out.println();
				System.out.println("What room would you like to move to?");
				String[] roomChoices = ray.getLocation().doors;
				int roomChoice = Tools.getWholeNumberInput(roomChoices);
				ray.changeLocation(doors[roomChoice]);

				
			}

			// check if the choice is to interact with the other being
			else if(choice == 4 && ray.getLocation().getBeings().size() > 1) {
				//method to inspect beings in the room
				System.out.println();
				transitionText();
				System.out.println();
				System.out.println("Who would you like to interact with?");
				String[] beingChoices = ray.getLocation().beings;
				int beingChoice = Tools.getWholeNumberInput(beingChoices);
				//method to interact with being chosen					

			}
			
			else {
				System.out.println("You must be confused, that isn't an option.");
				transitionText();
			}




		}
	}

}

