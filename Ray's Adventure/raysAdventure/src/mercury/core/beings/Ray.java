package mercury.core.beings;

import java.util.ArrayList;
import mercury.core.items.BasicItem;
import mercury.core.rooms.BasicRoom;
import misc.Tools;


public class Ray extends BasicBeing {


    /** Creates Array for Ray's inventory */
    public ArrayList<BasicItem> rayInventory = new ArrayList<BasicItem>();
    /* The IDE wants to add water as a parameter to this class, this needs to be investigated further
    BasicItem water = new BasicItem("Water bottle", "This is a bottle of water");
    rayInventory.add(water);
     */


    public Ray(BasicRoom location) {
        super("ray", 100, location);
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
    public void pickUpItem(BasicRoom location) {

        System.out.println();
        System.out.println("Please identify the item you would like to move from " +
                this.location.getName() + "to Ray's inventory:");
        System.out.println();

        System.out.println("This room contains:");
        for (int i = 1; i < rayInventory.size(); i++) {
            System.out.print("    ");

            //This is a debugging print and won't be needed later on if we can work out
            //how to safely implement an inventory management system that takes
            //into account arrays starting with 0
            System.out.print(i + ": ");

            //This prints out the item at the i location
            System.out.println(rayInventory.get(i));
        }

        int itemMove = Tools.getWholeNumberInput();

        //I don't know how the following line works but it does
        rayInventory.add((BasicItem) getLocation().getItem(itemMove));
        BasicItem tempItem = getLocation().getItem(itemMove);
        getLocation().removeItem(itemMove);
        System.out.println();

        System.out.println("Ray's inventory now contains:");
        inspectInventory();
        System.out.println();

         /* This seems extraneous and likely can be removed
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
            }

          */
    }

    public void dropItem(BasicRoom location){

        System.out.println("Ray's inventory contains:");
        inspectInventory();
        System.out.println();

            System.out.println(getLocation().getName() + " contains:");
            for (int i = 1; i < getLocation().getItemSize(); i++) {
                System.out.print("    ");
                System.out.print(i + ": ");
                System.out.println(rayInventory.get(i));
            }
            System.out.println();
            System.out.println("Please identify the item you would like to move from Ray's inventory to " +
                    getLocation().getName());
            System.out.println();

            int itemMove = Tools.getWholeNumberInput();

            //I don't know how the following line works but it does
            getLocation().addItem((BasicItem) rayInventory.get(itemMove));
            rayInventory.remove(itemMove);
            System.out.println();

            System.out.println("Ray's inventory now contains:");
            inspectInventory();
            System.out.println();

            System.out.println("The room now contains:");
            for (int i = 0; i < getLocation().getItemSize(); i++) {
                System.out.print("    ");
                System.out.print(i + ": ");
                System.out.println(getLocation().getItem(i));
                System.out.println();
            }
            System.out.println();
        }
        }


    //dropItem - Remove item from Ray’s inventory, Add item to current room’s items
        //Modify the code from Prototype-Inventory

    public void inspectInventory(){
        if(rayInventory.size() == 1){
            System.out.println("You aren't carrying any items!");
            }
        else{
            for (int i = 1; i < rayInventory.size(); i++) {
            System.out.print("    ");
            System.out.print(i + ": ");
            System.out.println(rayInventory.get(i));
                }
            }
        }


    /** Ray being class
     *  This needs to extend the BasicBeing changehealth class
     *  and include code for ending the game if Ray dies*/
}