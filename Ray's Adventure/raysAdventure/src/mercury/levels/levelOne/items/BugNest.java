package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class BugNest extends BasicItem {

    public boolean edible = false;
    public boolean stationary = false;

    //constructor for BugNest
    public BugNest() {
        super ("Bug nest", "It looks almost like a pinata made of mud.");
    }

    //use() method to use item functionality
    public void use(){
    }
}