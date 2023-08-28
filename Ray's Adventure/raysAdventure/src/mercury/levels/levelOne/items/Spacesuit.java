package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class Spacesuit extends BasicItem {

    public boolean edible = false;
    public boolean stationary = false;

    //constructor for Spacesuit
    public Spacesuit() {
        super ("Spacesuit", "A silver body suit with a domed glass helmet, like a fishbowl.");
    }

    //use() method to use item functionality
    public void use(){
    }
}