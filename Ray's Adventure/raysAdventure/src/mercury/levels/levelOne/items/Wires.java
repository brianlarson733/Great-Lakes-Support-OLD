package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class Wires extends BasicItem {

    public boolean edible = false;
    public boolean stationary = false;

    //constructor for Wires
    public Wires() {
        super ("Wires", "A mess of colored wires.");
    }

    //use() method to use item functionality
    public void use(){
    }
}
