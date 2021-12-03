package mercury.core.beings;

import mercury.core.items.BasicItem;
import mercury.core.rooms.BasicRoom;
import mercury.levels.levelOne.rooms.CargoBay;
import misc.Tools;

import java.util.Random;

public class Alloy extends BasicBeing {

	public boolean stayPut = true;
	int userChoice = 0;
	Ray ray;


	public Alloy(BasicRoom location, Ray ray) {
		super("Alloy", 50, location);
		this.ray=ray;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		System.out.println("How would you like to interact with Ray?");
		System.out.println(" ");
		System.out.println("1. Stay");
		System.out.println("2. Follow");
		System.out.println("3. Eat something of Ray's");
		System.out.println("4. Receive pets");
		System.out.println("5. Search the room");

		int choice = Tools.getWholeNumberInput();

		switch (choice) {
			case 1:
				stayPut = true;
				break;
			case 2:
				stayPut = false;
				//Update Ray to reference Alloy
				//Implement some form of code so that Alloy follows Ray if stayPut=false
				break;
			case 3:
				//List items that are edible, consume edible item, remove item from Ray's inventory
				ray.edibleInteraction();
				break;
			case 4:
				System.out.println("Alloy's tail wags as Ray pets his head");
				changeHealth(5);
				break;
			case 5:
				Random rand = new Random();
				int rand_int1 = rand.nextInt(3);
				/**
				//Query the hidden items list, note this is broken
				if (getLocation().hiddenItems == true){
					//Query hidden item list
					//If hidden item is present in same room, add item to Ray's inventory
				 */
				//If Alloy is in a specific room (tbd) find an item to help move the story forward
				/**
				 *

				if (){

				}
				else if (rand_int1 == 3){
					System.out.println("Alloy sniffs and finds a questionable item for Ray's inspection");
					System.out.println("It smells and is a bit slimy...");
						}

				*/
				break;

		}

		//Add logic for scanner input and passing user selection
		//Add logic for each of the actions

	}
}
