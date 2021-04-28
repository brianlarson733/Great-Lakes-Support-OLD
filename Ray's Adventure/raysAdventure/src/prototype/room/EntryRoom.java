package prototype.room;
import java.util.ArrayList;

import prototype.being.Ray;
import prototype.core.BasicBeing;
import prototype.core.BasicItem;
import prototype.core.BasicRoom;

public class EntryRoom extends BasicRoom {

	//Constructor for EntryRoom
	public EntryRoom () {
		super("The room where it all begins","Entry Room", new ArrayList<BasicItem>(),
				new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>());
		this.beings.add(new Ray(this));
	}

}