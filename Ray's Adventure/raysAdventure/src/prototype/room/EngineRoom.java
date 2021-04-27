package prototype.room;
import java.util.ArrayList;

import prototype.being.Alloy;
import prototype.core.BasicBeing;
import prototype.core.BasicItem;
import prototype.core.BasicRoom;

public class EngineRoom extends BasicRoom {

	//Constructor for EngineRoom
	public EngineRoom (BasicRoom room) {
		super("Here we GO","Engine Room", new ArrayList<BasicItem>(),
				new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>());
		this.doors.add(room);
	}

}