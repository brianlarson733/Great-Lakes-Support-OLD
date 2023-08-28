package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class Jar extends BasicItem {

    public boolean edible = false;
    public boolean stationary = false;

    //constructor for Jar
    public Jar() {
        super ("Jar", "A beautiful glass jar from my grandma.");
    }

    //use() method to use item functionality
    public void use(){
    }
}
