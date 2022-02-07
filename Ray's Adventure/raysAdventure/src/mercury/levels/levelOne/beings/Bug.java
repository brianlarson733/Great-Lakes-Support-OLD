package mercury.levels.levelOne.beings;

import mercury.core.beings.BasicBeing;
import mercury.core.rooms.BasicRoom;

public class Bug extends BasicBeing {

	public Bug(BasicRoom location) {
		super("The bug", 20, location);
		// TODO Auto-generated constructor stub
	}

//add lockedOn parameter in constructor, parameter toggles if ray enters a room with bug in it

		//method to attack Ray if Ray walks in a room with a bug (maybe toggle lockedOn parameter here)

		//method to move bug, check to see if lockedOn parameter is true, if it is, change bug's location to ray's location, if false, move randomly






	@Override
	public void interact() {
		// TODO Auto-generated method stub

		//menu and options when ray chooses to interact with bug
		//if ray attacks bug correctly, bug is stunned and loses health, 3 strikes and bug is dead with fly swatter, bug zapper is one hit KO

		System.out.println("How would you like to interact with the bug?");
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
				//This method lists items that are edible, consumes edible items, removes items from Ray's inventory
				ray.edibleInteraction();
				break;
			case 4:
				//This method secretly adds health to Alloy
				System.out.println("Alloy's tail wags as Ray pets his head");
				changeHealth(5);
				break;
			case 5:
				/**
				Query the hidden items list and check if any hidden item(s) are present in the room that Alloy
				 	and Ray are in. If so, show those item(s0 to Ray and add them to Ray's inventory

				If no hidden items are present then use the following code as Alloy potentially finds...something
				 	in the room.
				 */
				Random rand = new Random();
				int rand_int1 = rand.nextInt(3);
				if (rand_int1 == 3) {
					System.out.println("Alloy sniffs and finds a questionable item for Ray's inspection");
					System.out.println("It smells and is a bit slimy...");

				}else {
					System.out.println("Alloy sits down next to you without finding anything in the room");
						}
				break;
		}
		
		




	}

}
