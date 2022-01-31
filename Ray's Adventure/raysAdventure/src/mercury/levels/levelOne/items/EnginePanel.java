package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class EnginePanel extends BasicItem {

    public boolean edible = false;

    //constructor for EnginePanel
    public EnginePanel() {
        super ("Engine panel", "A square of metal that fits over the engine access port.");
    }

    //use() method to use item functionality
    public void use(){
    }
}
