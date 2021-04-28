package prototype.room;
import java.util.ArrayList;

import prototype.being.Alloy;
import prototype.core.BasicBeing;
import prototype.core.BasicItem;
import prototype.core.BasicRoom;

public class CockpitRoom extends BasicRoom {

	//Constructor for CockpitRoom
	public CockpitRoom () {
		super("This appears to be the Cockpit","Cockpit", new ArrayList<BasicItem>(),
				new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>());
	}

}