package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;
import mercury.core.items.Weapon;

public class Crowbar extends Weapon {

    public boolean stationary = false;

    //constructor for Crowbar
    public Crowbar() {
        super ("Crowbar", "It looks like a crowbar.", 10);
    }

    //use() method to use item functionality
    public void use(){
    }
}

