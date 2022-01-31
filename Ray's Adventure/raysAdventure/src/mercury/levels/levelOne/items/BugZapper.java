package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class BugZapper extends BasicItem {

    public boolean edible = false;

    //constructor for BugZapper
    public BugZapper() {
        super ("Bug zapper", "Why did I buy this weird ray gun?");
    }

    //use() method to use item functionality
    public void use(){
    }
}