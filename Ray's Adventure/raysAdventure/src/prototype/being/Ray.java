package prototype.being;
import java.util.ArrayList;

import misc.Tools;
import prototype.core.BasicBeing;
import prototype.core.BasicItem;
import prototype.core.BasicRoom;
import prototype.items.ConcreteBasicItem;
import prototype.room.EntryRoom;

public class Ray extends BasicBeing {

	//to be included in Nate's Inventory class
	//private ArrayList<BasicItem> inventory;

	public Ray(BasicRoom room){
		super("Ray", "Our titular hero.", 100, room);
	}
	

	
}