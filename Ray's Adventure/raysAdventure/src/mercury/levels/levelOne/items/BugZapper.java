package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;
import mercury.core.items.Weapon;

public class BugZapper extends Weapon {

    public boolean edible = false;
    public boolean stationary = false;

    //constructor for BugZapper
    public BugZapper() {
        super ("Bug zapper", "Why did I buy this weird ray gun?", 50);
    }

    //use() method to use item functionality
    public void use(){
    }
}