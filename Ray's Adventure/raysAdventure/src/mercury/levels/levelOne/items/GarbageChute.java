package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;
import mercury.core.beings.Ray;
import misc.Tools;

public class GarbageChute extends BasicItem {

    public boolean stationary = true;
    public boolean edible = false;
    Ray ray;

    //constructor for GarbageChute
    public GarbageChute() {
        super ("Garbage chute", "There's a small hatch in the wall which covers a chute to the infinite void of space.");
    }

    //use() method to use item functionality
    @Override
    public void use(){
        //Ask the user if they want to open the hatch and eject any item into space
        System.out.println("Would you like to open the hatch and eject an item into space?");
        System.out.println();
        ray.printInventory();
        System.out.println((ray.rayInventory.size() + 1) + ") Don't eject anything.");

        //Get user input
        int itemChoice = Tools.getWholeNumberInput();

        while (itemChoice > (ray.rayInventory.size() + 1)) {
            System.out.println("Please select a valid number");
            itemChoice = Tools.getWholeNumberInput();
        }

        if (itemChoice == (ray.rayInventory.size() + 1)) {
            System.out.println("You don't eject anything.");
        }
        //method to remove item delete item from game - not sure how to accomplish this
        if ((itemChoice > 1) && (itemChoice < (ray.rayInventory.size() + 1))) {
            ray.rayInventory.remove(itemChoice - 1);
        }




    }
}