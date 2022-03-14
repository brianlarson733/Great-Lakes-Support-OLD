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
		System.out.println("1. Punch it");
		System.out.println("2. Attack it with an item");
		System.out.println("3. Capture it");
	
		int choice = Tools.getWholeNumberInput();

		switch (choice) {
			case 1:
				
				break;
			case 2:
				
				 break;
			case 3:
				
				break;
			
		}
		
		




	}

}
