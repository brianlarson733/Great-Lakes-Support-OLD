package prototype.room;
import java.util.ArrayList;

import prototype.being.Alloy;
import prototype.core.BasicBeing;
import prototype.core.BasicItem;
import prototype.core.BasicRoom;

public class CargoRoom extends BasicRoom {

	//Constructor for CargoRoom
	public CargoRoom () {
		super("This room holds our stuff","Cargo Bay", new ArrayList<BasicItem>(),
				new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>());
		
	}

}