//NR - Turn this into the Inventory array class to hold items
// This will also require a driver class to generate the items to go into it.
//      That or adapt the ItemDriver class to test this as well

package prototype.items;

import java.util.ArrayList;
import prototype.being.Ray;
import prototype.core.BasicItem;

import misc.Tools;

public class Inventory {

    //Sample items for the inventory
    ConcreteBasicItem blankItem = new ConcreteBasicItem("Empty Space", "this is an empty space");
    ConcreteBasicItem water = new ConcreteBasicItem("Water Flask", "this is a full water flask");
    ConcreteBasicItem dehydratedFruit = new ConcreteBasicItem("Dehydrated Fruit", "this is dehydrated fruit");
    ConcreteBasicItem dogTreats = new ConcreteBasicItem("Alloy's snacks", "these are dog treats");

    //Crate the items array
    public ArrayList<ConcreteBasicItem> items = new ArrayList<ConcreteBasicItem>();

    static public boolean haveBugHammer;

    public void BasicInventory() {
        items.add(blankItem);
        //items.add(water);
        //items.add(dehydratedFruit);
        //items.add(dogTreats);
    }

    public void InventorySize() {
        System.out.print("There are " );
        System.out.print((items.size()-1));
        System.out.println(" items in this inventory");
    }

    public void InventoryList() {
        //System.out.println("This inventory contains: ");
        if(items.size() == 1){
            System.out.println("You aren't carrying any items!");
        }
        else{
            for (int i = 1; i < items.size(); i++) {
            System.out.print("    ");
            System.out.print(i + ": ");
            System.out.println(items.get(i));
            }

        }
        
    }

    public void InventoryRemove() {
            System.out.println("Which item would you like to drop?");
            int choice = Tools.getWholeNumberInput();
            items.remove(choice);
    }

    public ArrayList<ConcreteBasicItem> getInventory(){
        return items;
    }

    public static void InventoryPickup(Ray ray, Inventory rayInventory){
        System.out.println("Ray's inventory contains:");
        rayInventory.InventoryList();
        System.out.println();

        /* Commented out due to redundancy for the demo
        System.out.println(ray.getLocation().getName() + " contains:");
        for (int i = 1; i < ray.getLocation().items.size(); i++) {
            System.out.print("    ");
            System.out.print(i + ": ");
            System.out.println(ray.getLocation().items.get(i));
        }
        */

        System.out.println();
        System.out.println("Please identify the item you would like to move from " +
                ray.getLocation().getName() + " to Ray's inventory");
        System.out.println();

        int itemMove = Tools.getWholeNumberInput();

        //I don't know how the following line works but it does
        rayInventory.items.add((ConcreteBasicItem) ray.getLocation().items.get(itemMove));
        BasicItem tempItem = ray.getLocation().items.get(itemMove);
        ray.getLocation().items.remove(itemMove);
        System.out.println();

        //Boolean to assert that Ray is carrying the BugHammer
        if (tempItem instanceof BugHammer)
            haveBugHammer = true;

        System.out.println("Ray's inventory now contains:");
        rayInventory.InventoryList();
        System.out.println();

        System.out.println("The room now contains:");
        for (int i = 0; i < ray.getLocation().items.size(); i++) {
            System.out.print("    ");
            System.out.print(i + ": ");
            System.out.println(ray.getLocation().items.get(i));
        }
        System.out.println();

    }

    public static void InventoryDrop(Ray ray, Inventory rayInventory){
        System.out.println("Ray's inventory contains:");
        rayInventory.InventoryList();
        System.out.println();

        System.out.println(ray.getLocation().getName() + " contains:");
        for (int i = 1; i < ray.getLocation().items.size(); i++) {
            System.out.print("    ");
            System.out.print(i + ": ");
            System.out.println(ray.getLocation().items.get(i));
        }
        System.out.println();
        System.out.println("Please identify the item you would like to move from Ray's inventory to " +
                ray.getLocation().getName());
        System.out.println();

        int itemMove = Tools.getWholeNumberInput();

        //I don't know how the following line works but it does
        ray.getLocation().items.add((ConcreteBasicItem) rayInventory.items.get(itemMove));
        //rayInventory.items.add((ConcreteBasicItem) ray.getLocation().items.get(itemMove));
        rayInventory.items.remove(itemMove);
        //ray.getLocation().items.remove(itemMove);
        System.out.println();

        System.out.println("Ray's inventory now contains:");
        rayInventory.InventoryList();
        System.out.println();

        System.out.println("The room's now contains:");
        for (int i = 0; i < ray.getLocation().items.size(); i++) {
            System.out.print("    ");
            System.out.print(i + ": ");
            System.out.println(ray.getLocation().items.get(i));
            System.out.println();
        }
        System.out.println();
    }
}