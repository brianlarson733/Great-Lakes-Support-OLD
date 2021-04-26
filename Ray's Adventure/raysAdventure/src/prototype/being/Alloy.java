package prototype.being;
import misc.Tools;
import prototype.core.BasicBeing;
import prototype.core.BasicRoom;
import prototype.room.EntryRoom;

public class Alloy extends BasicBeing {

	public boolean stayPut = false;
	
	public Alloy(BasicRoom room){
		super("Alloy", "Our hero's faithful companion.", 50, room);
	}
	
	public boolean getStayPut() {
		return this.stayPut;
	}

	public void interact() {
		System.out.println("1 - Give Alloy a good head rub.");
	    System.out.println("2 - Feed Alloy.");
	    System.out.println("3 - Command Alloy to attack!");
	    System.out.println("4 - Command Alloy to stick to your side.");
	    System.out.println("5 - Command Alloy to stay in this room.");
		int choice = Tools.getWholeNumberInput();
		
		if(choice ==1) {
			
			
			//Alloy increases in health by 1
			if (this.getHealth() < 100) {
				this.changeHealth(1);
				System.out.println("Ahhhh, he really enjoyed that. You notice he looks happier.");
			}
			
			else {
				System.out.println("He doesn't look like he wants you to pet him anymore.");
			}
			
		}
		
		else if(choice==2) {
			System.out.println("What do you want to feed him with?");

			//call the review inventory method to see if anything edible is there
			//if it is edible, increase health. If it isn't edible, decrease health
			
			System.out.println("Bummer, you don't see anything edible for the little guy.");
		}
		
		else if(choice==3) {
			if(this.getLocation().getBeings().size()<3) {
				System.out.println("There isn't anyone else to attack!");
			}
			else {
				this.getLocation().getBeings().get(2).changeHealth(-10);
				System.out.println("That looks like it hurt. Alloy bit " + 
						this.getLocation().getBeings().get(2).getName() + "!");
				if (this.getLocation().getBeings().get(2).getHealth() < 1) {
					System.out.println(this.getLocation().getBeings().get(2).getName() + " has died!");
					this.getLocation().getBeings().remove(2);
				}
			}
		}
		
		else if(choice==4) {
			System.out.println("Alloy looks happy to be your companion and walk around with you.");
			stayPut = true;
		}
		
		else if(choice==5) {
			System.out.println("He appears to understand the command. He'll stay put.");
			stayPut = false;
		}
	}
	
}

