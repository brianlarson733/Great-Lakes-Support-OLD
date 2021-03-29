//NR - Turn this into the Inventory array class to hold items
// This will also require a driver class to generate the items to go into it.
//      That or adapt the ItemDriver class to test this as well

package prototype.items;

import java.util.ArrayList;

public class Inventory {

    //Sample items for the inventory
    ConcreteBasicItem water = new ConcreteBasicItem("This is a water flask", "Water Flask");
    ConcreteBasicItem dehydratedFruit = new ConcreteBasicItem("This is dehydrated fruit", "Dehydrated Fruit");
    ConcreteBasicItem dogTreats = new ConcreteBasicItem("These are dog treats", "Alloy's snacks");

    //public ArrayList<ConcreteBasicItem> items;
    public ArrayList<ConcreteBasicItem> items = new ArrayList<ConcreteBasicItem>();

    public void Inventory() {
        items.add(water);
        items.add(dehydratedFruit);
        items.add(dogTreats);
    }

    public void InventorySize() {
        System.out.print("There are " );
        System.out.print(items.size());
        System.out.println(" items in Ray's inventory");
    }

    public void InventoryList() {
        System.out.println("Ray's inventory includes: ");
        for (int i = 0; i < items.size(); i++) {
            System.out.print(i + ": ");
            System.out.println(items.get(i));
            }
        }

    public void InventoryRemove(){
        items.remove(0);

    }
}