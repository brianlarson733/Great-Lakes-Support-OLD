package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class Map extends BasicItem {

    public boolean edible = false;
    public boolean stationary = false;

    //constructor for Map
    public Map() {

        super ("Map", "This display shows you where you are right now.");
    }

    //use() method to use item functionality
    public void use(){
    }
}