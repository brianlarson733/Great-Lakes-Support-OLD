package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;
import mercury.core.items.Weapon;

public class FlySwatter extends Weapon {

    public boolean edible = false;
    public boolean stationary = false;

    //constructor for FlySwatter
    public FlySwatter() {
        super ("Fly swatter", "A plastic mesh square on the end of a long handle.", 5);
    }

    //use() method to use item functionality
    public void use(){
    }
}

