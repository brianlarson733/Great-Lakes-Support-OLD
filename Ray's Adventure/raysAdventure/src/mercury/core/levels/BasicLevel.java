package mercury.core.levels;

import java.util.ArrayList;
import java.util.Arrays;
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
    //right now the level code is not being presented to the user so that rayChangeHealth can end the level without having a level code
	public static void endLevel(boolean userWins) {
		if(userWins == true){
			System.out.println("Success! You've completed this level!");
			System.out.println("Please save the following code to move on to the next level.");
			System.out.println("You can also use this code to return to the next level the next time you start the game:");
			//System.out.println(levelCode);
			transitionText();
			MercuryGame.levelSelector();
		}
		else {
			System.out.println("Oh no! You've suffered a mortal wound! As the world fades to black, your last thought is"
				+ " 'Maybe I should've committed my code more regularly...'");
			System.out.println("How sad, Ray's space adventures have come to an end!");			
			transitionText();
			MercuryGame.levelSelector();
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

			System.out.println("You are in the " + ray.getLocation().getName() + ".");
			ray.getLocation().printBeings();
			System.out.println();
			System.out.println("What do you want to do?");
			System.out.println();
			
			// create list of choices for the user
			ArrayList<String> choices = new ArrayList<String>(Arrays.asList(
					"Inspect the room", "Inspect the items you are carrying", "Go to another room"));

			// this will add the interact option if there is a being in the room
			if(ray.getLocation().beings.size() > 1 ){
				choices.add("Interact with beings in the room");	

			}

			// this will print out interaction options if there is another being in the room
			

			System.out.println();
			int choice = Tools.getWholeNumberInput(choices);
			System.out.println();


			//Displays the contents of the room's inventory
			//This needs to somehow determine both Ray's location and call the array for that location
			if (choice == 1) {
				ray.getLocation.printItems();

					if (ray.getLocation().items.size() == 0) {
						transitionText();
					}
					else {
					transitionText();
			        System.out.println();
					System.out.println("Would you like to do something with one of the items in the room?");
					String[] itemChoices = {"Pick up an Item", "No"};
					int itemChoice = Tools.getWholeNumberInput(itemChoices);
					//Moving an item from the room's inventory to Ray's inventory
					if (itemChoice == 1) {
						ray.pickUpItem();
					}
				}

			}
}
			// Displays the contents of Ray's inventory.
			else if (choice == 2) {
					ray.printInventory();
					System.out.println();
					transitionText();
					System.out.println();

					//only ask the player to do something with the inventory if the inventory is non-empty
					if(ray.rayInventory.size() != 0){
						
						System.out.println("Would you like to do something with one of the items in your inventory?");
						String[] itemChoices = {"Drop an Item", "Use an Item","No"};
						int itemChoice = Tools.getWholeNumberInput(itemChoices);
						
						if(itemChoice == 1){
							ray.dropItem();
						}
						
						else if(itemChoice == 2){
							ray.useItem();
						}
					}
				}
			
			// Displays room doors
			else if(choice == 3) {
				//method to inspect doors in the room
				ray.getLocation().printDoors();
				System.out.println();
				transitionText();
				System.out.println();
				System.out.println("What room would you like to move to?");
				int roomChoice = Tools.getWholeNumberInput();
				while(roomChoice > ray.getLocation().doors.size()){
					System.out.println("Please select a valid number");
					roomChoice = Tools.getWholeNumberInput();
				}
				ray.changeLocation(ray.getLocation().doors.get(roomChoice-1));

				
			}

			// check if the choice is to interact with the other being
        
			else if(choice == 4) {
				System.out.println("Who would you like to interact with?");
				
				//logic to take input of being name

				Scanner scanner = new Scanner(System.in);
				boolean beingMatch = false;
				while(!beingMatch){
					System.out.println("Please enter the name of the being to interact with it: ")
					String interactBeing = scanner.nextLine(); //Read user input for being to interact with
					for (int i = 0; i < ray.getLocation().beings.size(); i++) {
	    				if(!(ray.getLocation().beings.get(i) instanceof Ray)) {
    						if(interactBeing == ray.getLocation().beings.get(i).name) {
    							beingMatch = true;
	    					}
		    			}
					}
					if(beingMatch != true){
						System.out.println("That is not a valid name for a being. Please try again");
						System.out.println();
					}
				}
				
				//method to interact with being chosen
	        	

			}
			
			else {
				System.out.println("You must be confused, that isn't an option.");
				transitionText();
			}


		}
	}

}

