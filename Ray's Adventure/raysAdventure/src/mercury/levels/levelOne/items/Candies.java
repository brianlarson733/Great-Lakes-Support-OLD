package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;
import mercury.core.items.HealthItem;

public class Candies extends HealthItem {

    public boolean edible = true;
    public boolean stationary = false;

    //constructor for Candies
    public Candies() {
        super ("Candies", "Brightly colored sticky candy. Yum!", 5);
    }

    //use() method to use item functionality
    public void use(){
    }
}