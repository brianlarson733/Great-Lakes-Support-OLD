package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class Apple extends BasicItem {

    public boolean edible = true;
    public boolean stationary = false;

    //constructor for Apple
    public Apple() {
        super ("Apple", "Shiny red apple.");
    }

    //use() method to use item functionality
    public void use(){
    }
}
