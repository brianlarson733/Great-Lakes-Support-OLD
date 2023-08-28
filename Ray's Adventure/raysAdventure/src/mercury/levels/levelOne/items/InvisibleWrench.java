package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class InvisibleWrench extends BasicItem {

    public boolean edible = false;
    public boolean stationary = false;

    //constructor for InvisibleWrench
    public InvisibleWrench() {
        super ("InvisibleWrench", "Now that you have the goggles on, you can see a perfectly bog standard bulk machined hardware wrench.");
    }

    //use() method to use item functionality
    public void use(){
    }
}