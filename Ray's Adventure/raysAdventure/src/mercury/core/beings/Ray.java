package mercury.core.beings;

import java.util.ArrayList;
import mercury.core.BasicItem;
import mercury.core.rooms.BasicRoom;
import misc.Tools;
import prototype.core.PrototypeGame;
import prototype.items.BugHammer;
import prototype.items.ConcreteBasicItem;
import prototype.items.Inventory;

public class Ray extends BasicBeing {

    /** Creates Array for Ray's inventory */
    private ArrayList<BasicItem> rayInventory = new ArrayList<>();

    /**
     * Constructors for all instance variables
     *
     * @param name
     * @param health
     * @param location
     */
    public Ray(String name, int health, BasicRoom location) {
        super(name, health, location);
    }

    /**
     * This method is not called as Ray doesn't need to interact with Ray
     */
    public void interact() {
    }

    /** Constructor to initialize rayInventory - redundant with the above array creation
     * Not implemented */


    /** Change location override from mercury BasicBeing
     * This needs to be reviewed to verify that its accurate
     * @param newLocation
     */
    @Override
    public void changeLocation(BasicRoom newLocation) {
        super.changeLocation(newLocation);
    }
    /** pickUpItem - Remove item from current room’s items, Add item to Ray’s inventory
     * this is code from the prototype Inventory class
     * This code needs to be heavy updated to align with the new implementation
                */
                public static void pickUpItem(mercury.beings.Ray, Inventory rayInventory){

                    System.out.println();
                    System.out.println("Please identify the item you would like to move from " +
                            Ray.getLocation().printName() + " to Ray's inventory");
                    System.out.println();

                    System.out.println("This room contains:");
                    for (int i = 1; i < ray.getLocation().items.size(); i++) {
                        System.out.print("    ");

                        //This is a debugging print and won't be needed later on if we can work out
                        //how to safely implement an inventory management system that takes
                        //into account arrays starting with 0
                        System.out.print(i + ": ");

                        //This prints out the item at the i location
                        System.out.println(ray.getLocation().items.get(i));
                    }

                    int itemMove = Tools.getWholeNumberInput();

                    //I don't know how the following line works but it does
                    rayInventory.items.add((ConcreteBasicItem) ray.getLocation().items.get(itemMove));
                    prototype.core.BasicItem tempItem = ray.getLocation().items.get(itemMove);
                    ray.getLocation().items.remove(itemMove);
                    System.out.println();

                    //Boolean to assert that Ray is carrying the BugHammer
                    if (tempItem instanceof BugHammer)
                        haveBugHammer = true;

                    System.out.println("Ray's inventory now contains:");
                    rayInventory.InventoryList();
                    System.out.println();

                    System.out.println("The room now contains:");
                    if(ray.getLocation().items.size() == 1){
                        System.out.println("    Nothing!");
                    }
                    else{
                        for (int i = 0; i < ray.getLocation().items.size(); i++) {
                            System.out.print("    ");
                            System.out.print(i + ": ");
                            System.out.println(ray.getLocation().items.get(i));
                        }

                    }
                    PrototypeGame.transitionText();

                }

    //dropItem - Remove item from Ray’s inventory, Add item to current room’s items
        //Modify the code from Prototype-Inventory

    //inspectInventory - List out all items in Ray’s inventory
        //Modify the code from Prototype-Inventory
}