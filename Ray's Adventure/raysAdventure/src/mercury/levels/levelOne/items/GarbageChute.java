package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class GarbageChute extends BasicItem {

    public boolean stationary = true;

    public boolean edible = false;

    //constructor for GarbageChute
    public GarbageChute() {
        super ("Garbage chute", "There's a little flap in the wall covering the chute which leads to the infinite void of space.");
    }

    //use() method to use item functionality
    public void use(){
        //Ask the user if they want to open the hatch and eject any item into space

        //Any item/being ejected should have its object instance deleted from the game - how to accomplish this?

    }
}
