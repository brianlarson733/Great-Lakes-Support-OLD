//NR - Turn this into the Inventory array class to hold items
// This will also require a driver class to generate the items to go into it.
//      That or adapt the ItemDriver class to test this as well

package prototype.items;

import java.util.ArrayList;

import misc.Tools;

public class Inventory {

    //Sample items for the inventory
    ConcreteBasicItem blankItem = new ConcreteBasicItem("This is an empty space", "Empty Space");
    ConcreteBasicItem water = new ConcreteBasicItem("Basic Item: This is a water flask", "Water Flask");
    ConcreteBasicItem dehydratedFruit = new ConcreteBasicItem("Basic Item: This is dehydrated fruit", "Dehydrated Fruit");
    ConcreteBasicItem dogTreats = new ConcreteBasicItem("Basic Item: These are dog treats", "Alloy's snacks");

    //public ArrayList<ConcreteBasicItem> items;
    public ArrayList<ConcreteBasicItem> items = new ArrayList<ConcreteBasicItem>();

    public void BasicInventory() {
        items.add(blankItem);
        items.add(water);
        items.add(dehydratedFruit);
        items.add(dogTreats);
    }

    public void InventorySize() {
        System.out.print("There are " );
        System.out.print((items.size()-1));
        System.out.println(" items in this inventory");
    }

    public void InventoryList() {
        //System.out.println("This inventory contains: ");
        for (int i = 1; i < items.size(); i++) {
            System.out.print("    ");

            //This is a debugging print and won't be needed later on if we can work out
            //how to safely implement an inventory management system that takes
            //into account arrays starting with 0
            System.out.print(i + ": ");

            //This prints out the item at the i location
            System.out.println(items.get(i));
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

}