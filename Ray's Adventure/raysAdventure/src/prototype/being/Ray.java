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

	/**
	 * Constructor
	 * @param room - Ray's starting location
	 */
	public Ray(BasicRoom room){
		super("Ray", "Our titular hero.", 50, room);
	}
	
	/**
	 * This method is not called as Ray doesn't need to interact with Ray
	 */
	public void interact() {}
	
	/**
	 * This contains the logic for moving Ray around
	 * @param alloy - this reference is needed so Alloy can be moved with Ray
	 * @param bug - this reference is needed so the Bug can be moved with Ray
	 */
	public void goToAnotherRoom(Alloy alloy, Bug bug) {
		
		if(this.getLocation().getDoors().size() == 1) {
			System.out.print("You see only 1 door from this room. ");
		}
		else {
			System.out.print("You see " + this.getLocation().getDoors().size() + " doors. ");
		}
		
		System.out.println("Please make a selection.");
		System.out.println();
		
		System.out.println("1: Stay in this room");
		for(int i=0; i < this.getLocation().getDoors().size(); i++) {
			System.out.print((i+2) + ": ");
			this.getLocation().getDoors().get(i).printName();
		}
		
		
		//this next code block will grab user input and ensure it matches the choices
		int userChoice = 100;		
		do {
			System.out.println();
			userChoice = Tools.getWholeNumberInput();
		}
		while (userChoice > (this.getLocation().getDoors().size() + 1));
		
		//user chooses to stay
		if(userChoice==1) {
			System.out.println();
			System.out.println("Okay, you have chosen to stay here.");
			PrototypeGame.transitionText();
		}
		
		//user chooses to change rooms
		if(userChoice > 1) {
			
			//note that 'this' refers to the Ray object
			BasicRoom oldRoom = this.getLocation();
			
			//take the user's choice and convert it to the room reference
			this.changeLocation(this.getLocation().getDoors().get(userChoice-2));
			
			//remove Ray from the current room
			oldRoom.removeBeing(this);
			
			//add Ray to the beings list in his new room
			this.getLocation().addBeing(this);
			
            //move Alloy with Ray if Alloy is in the same room and if stayPut is false
			if (alloy.getLocation().equals(oldRoom)) {
				if(!alloy.getStayPut()) {
					
					//move Alloy to Ray's location 
					alloy.changeLocation(this.getLocation());
					
					//remove Alloy's reference from the old room
					oldRoom.removeBeing(alloy);
					
					//add Alloy's reference to the new room
					this.getLocation().addBeing(alloy);
				}
			}
						
			System.out.println();
			System.out.println("Welcome to the " + this.getLocation().getName() + ".");
			System.out.println();
			
			//display beings that are in the room with you
			if(this.getLocation().getBeings().size()==1) {
				System.out.println("You don't see anyone else in the room.");
			}
			else {
				
				//loop through the room's being list to display each being's name
				for (int i = 0; i < this.getLocation().getBeings().size(); i++) {
					
					//grab the being as long as it isn't Ray
					if (!(this.getLocation().getBeings().get(i) instanceof Ray)) {
						
						//Alloy was commanded to stay with you so it notes he is still there
						if(this.getLocation().getBeings().get(i) instanceof Alloy && !alloy.getStayPut()) {
							System.out.println("Alloy is still at your side.");
							System.out.println();
							
							//go to the next being
							continue;
						}
						if(this.getLocation().getBeings().get(i) instanceof Bug) {
							System.out.println("You see a large bug in the room.");
						}
					}
				}

			}
			
			PrototypeGame.transitionText();
		
			// move the Bug with Ray if the Bug is in the same room
            if (bug.getLocation().equals(oldRoom)) {
                
            	//move the Bug to Ray's location
            	bug.changeLocation(this.getLocation());
                
            	//remove the Bug reference from the old room
            	oldRoom.removeBeing(bug);
                
            	//add the Bug reference to the new room
            	this.getLocation().addBeing(bug);
                
            	//display a pseudo random message about the bug's movements 
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