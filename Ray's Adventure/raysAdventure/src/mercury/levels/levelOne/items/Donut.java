package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class Donut extends BasicItem {

    public boolean edible = true;
    public boolean stationary = false;

    //constructor for Donut
    public Donut() {
        super ("Donut", "Vanilla donut with chocolate glaze.");
    }

    //use() method to use item functionality
    public void use(){
    }
}
