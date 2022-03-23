package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class DogTreats extends BasicItem {

    public boolean edible = true;
    public boolean stationary = false;

    //constructor for DogTreats
    public DogTreats() {
        super ("Dog treats", "Bone shaped cookies that smell a little like meat.");
    }

    //use() method to use item functionality
    public void use(){
    }
}
