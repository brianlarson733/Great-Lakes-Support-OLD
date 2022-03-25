package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;
import mercury.core.items.HealthItem;

public class Donut extends HealthItem {

    public boolean edible = true;
    public boolean stationary = false;

    //constructor for Donut
    public Donut() {
        super ("Donut", "Vanilla donut with chocolate glaze.",20);
    }

    //use() method to use item functionality
    public void use(){
    }
}
