package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class Bolt extends BasicItem {

    public boolean edible = false;
    public boolean stationary = false;

    //constructor for Bolt
    public Bolt() {
        super ("Bolt", "A bog standard, bulk machined hardware bolt");
    }

    //use() method to use item functionality
    public void use(){
    }
}