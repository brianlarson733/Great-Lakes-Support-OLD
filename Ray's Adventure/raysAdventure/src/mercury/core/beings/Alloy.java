package mercury.core.beings;

import mercury.core.rooms.BasicRoom;

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
		System.out.println("");
		System.out.println("Stay");
		System.out.println("Follow");
		System.out.println("Eat something of Ray's");
		System.out.println("Recieve pets");
		System.out.println("Search the room");

		//Add logic for scanner input and passing user selection
		//Add logic for each of the actions

	}
}
