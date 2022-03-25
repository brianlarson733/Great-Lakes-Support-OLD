package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;
import mercury.core.items.HealthItem;

public class Coffee extends HealthItem {

    public boolean edible = true;
    public boolean stationary = false;

    //constructor for Coffee
    public Coffee() {
        super ("Coffee", "Strong dark liquid.", 10);
    }

    //use() method to use item functionality
    public void use(){
    }
}
