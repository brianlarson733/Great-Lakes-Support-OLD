package mercury.core.beings;

import mercury.core.items.BasicItem;
import mercury.core.rooms.BasicRoom;
import mercury.core.beings.Ray;
import misc.Tools;
import java.util.ArrayList;

import java.util.Random;

public class Alloy extends BasicBeing {

	public boolean stayPut = true;
	int userChoice = 0;

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
				//Make this a class/method within Ray
					System.out.println("Alloy can eat the following items:");
					for (int i = 1; i < getLocation().getItemsSize(); i++) {
						System.out.print("    ");
						System.out.print(i + ": ");
						//the following requires an instantiated version of "rayInventory"
						//so a constructor is likely needed
						if (Ray.rayInventory.get(i.edible) == true) {
							System.out.println(Ray.rayInventory.get(i));
						}
					}

				//Provide action to eat one of the items
				//Make this a class/method within Ray
					System.out.println("Which item should Alloy eat?");
					//this needs to be updated so that it limits at the number of edible items
					while(true) {

						userChoice = Tools.getWholeNumberInput();

						if (userChoice <= Ray.rayInventory.size()) {
							break;
						}
						System.out.println("Sorry, that isn't a valid option");
					}
				//Remove the item from Ray's inventory
				//Make this a class/method within Ray
					BasicItem itemToDrop = Ray.rayInventory.get(userChoice-1);
					Ray.rayInventory.remove(itemToDrop);
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
