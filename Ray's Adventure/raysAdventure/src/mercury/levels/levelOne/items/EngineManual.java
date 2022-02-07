package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class EngineManual extends BasicItem {

    public boolean edible = false;

    //constructor for EngineManual
    public EngineManual() {
        super ("Engine manual", "A few hundred pages of complicated diagrams stapled together in a booklet.");
    }

    //use() method to use item functionality
    public void use(){
    }
}
