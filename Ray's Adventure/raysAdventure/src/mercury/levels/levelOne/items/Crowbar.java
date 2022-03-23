package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class Crowbar extends BasicItem {

    public boolean edible = false;
    public boolean stationary = false;

    //constructor for Crowbar
    public Crowbar() {
        super ("Crowbar", "It looks like a crowbar.");
    }

    //use() method to use item functionality
    public void use(){
    }
}

