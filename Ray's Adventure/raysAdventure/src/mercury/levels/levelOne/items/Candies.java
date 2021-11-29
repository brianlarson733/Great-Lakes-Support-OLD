package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class Candies extends BasicItem {

    public boolean edible = true;

    //constructor for Candies
    public Candies() {
        super ("Candies", "Brightly colored sticky candy. Yum!");
    }

    //use() method to use item functionality
    public void use(){
    }
}