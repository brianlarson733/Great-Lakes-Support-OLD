package prototype.being;
import prototype.core.BasicBeing;
import prototype.room.EntryRoom;

public class Ray extends BasicBeing {

	private ArrayList<BasicItem> inventory;

	public Ray(){
		super("Ray", "Our titular hero.", 100, new EntryRoom());
	}

}