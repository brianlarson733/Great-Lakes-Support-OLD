package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;
import mercury.core.items.HealthItem;

public class Apple extends HealthItem {

    public boolean edible = true;
    public boolean stationary = false;

    //constructor for Apple
    public Apple() {
        super ("Apple", "Shiny red apple.", 30);
    }

    //use() method to use item functionality
    public void use(){
    }
}
