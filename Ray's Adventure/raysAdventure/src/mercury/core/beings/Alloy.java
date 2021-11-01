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
		
	}
}
