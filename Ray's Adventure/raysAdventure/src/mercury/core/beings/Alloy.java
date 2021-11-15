package mercury.core.beings;

import mercury.core.rooms.BasicRoom;
import misc.Tools;

import java.util.Random;

public class Alloy extends BasicBeing {

	public boolean stayPut = true;

	public Alloy(BasicRoom location, boolean stayPut) {
		super("Alloy", 50, location);
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
				break;
			case 3:
				//List items that are edible
				//Provide action to eat one of the items
				//Remove the item from Ray's inventory
				break;
			case 4:
				System.out.println("Alloy's tail wags as Ray pets his head");
				//this.health = this.health + 5;
				//The above needs to be updated to work as expected
				break;
			case 5:
				Random rand = new Random();
				int rand_int1 = rand.nextInt(3);
				if (rand_int1 == 3){
					System.out.println("Alloy sniffs and finds a questionable item for Ray's inspection");
					System.out.println("It smells and is a bit slimy...");
						}

				//If Alloy is in a specific room (tbd) find an item to help move the story forward
				break;

		}

		//Add logic for scanner input and passing user selection
		//Add logic for each of the actions

	}
}
