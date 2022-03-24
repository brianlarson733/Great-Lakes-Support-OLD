package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class Coffee extends BasicItem {

    public boolean edible = true;
    public boolean stationary = false;

    //constructor for Coffee
    public Coffee() {
        super ("Coffee", "Strong dark liquid.");
    }

    //use() method to use item functionality
    public void use(){
    }
}
