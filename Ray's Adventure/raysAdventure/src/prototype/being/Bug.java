package prototype.being;

import misc.Tools;
import prototype.core.BasicBeing;
import prototype.core.BasicRoom;
import prototype.core.PrototypeGame;
import prototype.items.Inventory;


import java.util.Random;

public class Bug extends BasicBeing {

	public Bug(BasicRoom room) {
		super("the bug", "An ugly creature.", 25, room);
	}

	//public void interact() {}

	public void interact() {
		System.out.println("1 - Say 'hello, friend!'");
	    System.out.println("2 - Feed the creature.");
	    System.out.println("3 - Try to swat or kick the thing to make it go away.");


		//Logic to check Ray's inventory and see if it contains the bugHammer
	    if (Inventory.haveBugHammer)
			System.out.println("4 - Swing the BugHammer.");

		System.out.println();

	  
	    int choice = Tools.getWholeNumberInput();
		
		if(choice ==1) {
			
			System.out.println("The bug stares back at you with beady, greedy eyes.");
			PrototypeGame.transitionText();
		}
		
		else if(choice==2) {
			
			System.out.println("Hmmmm maybe it isn't a good idea to feed the bug? I wouldn't\n"
					+ "want that thing sticking around if I were you.");
			PrototypeGame.transitionText();
		}
		
		else if(choice==3) {
			
			//make action results pseudorandom
			Random rand = new Random();
			int result = rand.nextInt(3);
			if (result == 0) {
				System.out.println("Swatting at the creature with your hands didn't do much good.");
				System.out.println("It is hissing at you...and it appears to have just gotten larger.");
				this.changeHealth(5);
			}
			if (result == 1) {
				System.out.println("Hmmm...you stomped on it with your boot but the thing is as hard as a rock!");
				System.out.println("It scurried off to the edge of the room. Also, does it look bigger to you, too?");
				this.changeHealth(5);
			}
			if (result == 2) {
				System.out.println("In your attempt to kick it you appear to have knocked off one of its arms.");
				System.out.println("Eek, some of its gooey blood appears to be foaming on the floor.");
				this.changeHealth(-2);
			}
			PrototypeGame.transitionText();
		}

		else if(choice==4 && Inventory.haveBugHammer) {
			System.out.println();
			System.out.println("It's not called 'bug hammer' for nothing..."
					+ "go ahead and put\non a pair of sunglasses and consider"
					+ " this bug closed.");
			PrototypeGame.transitionText();
			this.changeHealth(-100);
			
		}
		
		else {
			System.out.println();
			System.out.println("That isn't an option!");
			PrototypeGame.transitionText();
		}

		
	}
	
}
