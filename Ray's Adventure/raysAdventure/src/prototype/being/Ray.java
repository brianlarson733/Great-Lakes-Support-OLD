package prototype.being;
import java.util.ArrayList;
import java.util.Random;

import misc.Tools;
import prototype.core.BasicBeing;
import prototype.core.BasicItem;
import prototype.core.BasicRoom;
import prototype.core.PrototypeGame;
import prototype.items.ConcreteBasicItem;
import prototype.room.EntryRoom;

public class Ray extends BasicBeing {

	//to be included in Nate's Inventory class
	//private ArrayList<BasicItem> inventory;

	public Ray(BasicRoom room){
		super("Ray", "Our titular hero.", 50, room);
	}
	
	public void interact() {}
	
	public void goToAnotherRoom(Alloy alloy, Bug bug) {
		
		if(this.getLocation().getDoors().size() == 1) {
			System.out.println("You see only 1 door from this room.");
		}
		else {
			System.out.println("You see " + this.getLocation().getDoors().size() + " doors.");
		}
		
		System.out.println("Please make a selection.");
		System.out.println("1: Stay in this room.");
		for(int i=0; i < this.getLocation().getDoors().size(); i++) {
			System.out.print((i+2) + ": ");
			this.getLocation().getDoors().get(i).printName();
		}
		
		int temp = 100;
		
		do {
			System.out.println();
			temp = Tools.getWholeNumberInput();
		}
		while (temp > (this.getLocation().getDoors().size() + 1));
		
		if(temp > 1) {
				
			BasicRoom tempRoom = this.getLocation();
			this.changeLocation(this.getLocation().getDoors().get(temp-2));
			tempRoom.removeBeing(this);
			this.getLocation().addBeing(this);
			
            // move Alloy with Ray if Alloy is in the same room and if stayPut is false
			if (alloy.getLocation().equals(tempRoom)) {
				if(!alloy.getStayPut()) {
					alloy.changeLocation(this.getLocation());
					tempRoom.removeBeing(alloy);
					this.getLocation().addBeing(alloy);
				}
			}
			
			System.out.println("");
			System.out.println("Welcome to the " + this.getLocation().getName());
			if(this.getLocation().getBeings().size()==1) {
				System.out.println("You don't see anyone else in the room.");
			}
			else {

				for (int i = 0; i < this.getLocation().getBeings().size(); i++) {
					if (!(this.getLocation().getBeings().get(i) instanceof Ray)) {
						if(this.getLocation().getBeings().get(i) instanceof Alloy && !alloy.getStayPut()) {
							System.out.println("Alloy is still at your side");
							continue;
						}
						System.out.println("You see " +
								this.getLocation().getBeings().get(i).getName()
								+ " here");
					}
				}
			}
		
			PrototypeGame.transitionText();

			
            // move the bug with Ray if the bug is in the same room
            if (bug.getLocation().equals(tempRoom)) {
                bug.changeLocation(this.getLocation());
                tempRoom.removeBeing(bug);
                this.getLocation().addBeing(bug);
                Random rand = new Random();
                int randomChoice = rand.nextInt(3);
                if (randomChoice == 0) {
                	System.out.println("How frightening! The bug followed you through the door!");
                }
                if (randomChoice == 1) {
                	System.out.println("The bug followed you here!");
                }
                	
                if (randomChoice == 2) {
                	System.out.println("That bug is quick! It followed you in.");
                }
                
                PrototypeGame.transitionText();
            }
		}
		
	}
     
	
}