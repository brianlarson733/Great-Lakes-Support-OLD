package prototype.being;

import misc.Tools;
import prototype.core.BasicBeing;
import prototype.core.BasicRoom;
import prototype.core.PrototypeGame;

import java.util.Random;

public class Bug extends BasicBeing {

	public Bug(BasicRoom room) {
		super("a bug", "An ugly creature.", 25, room);
	}

	public void interact() {
		System.out.println("1 - Say 'hello, friend!'");
	    System.out.println("2 - Feed the creature.");
	    System.out.println("3 - Try to swat or kick the thing to make it go away.");
	  
	    int choice = Tools.getWholeNumberInput();
		
		if(choice ==1) {
			
			System.out.println("The bug stares back at you with beady, greedy eyes.");
			PrototypeGame.transitionText();
		}
		
		else if(choice==2) {
			System.out.println("What do you want to feed him with?");

			//call the review inventory method to see if anything edible is there
			//when feeding the bug, increase the bugs health 
			//make the bug nibble on Ray's hand, decreasing his health
			
			System.out.println("Hmmmm maybe it isn't a good idea to feed the bug");
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
		
		
	}
	
}
