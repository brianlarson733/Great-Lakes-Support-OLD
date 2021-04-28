/*
This class is a driver for testing of the item system
Currently this class initiates a new ArrayList
Then add both the Basic items in Ray's inventory to the list
As well as Offensive, Protective, and Health items

To do:
Have Removed items be added to the active room's inventory
Add/modify feeding alloy which should then remove the treats from the inventory

 */


package prototype.items;

public class ItemDriver {
    public static void main(String args[]) {

        OffensiveItem ns = new OffensiveItem();

        HealthItem nh = new HealthItem("The item appears as a perfect glass sphere with a red liquid inside",
                "Restorationation");

        SpaceSuitItem newsuit = new SpaceSuitItem("The space suit has a faded white and blue " +
                "checkered pattern", "Portal 6.0");

        //Create the array object
        Inventory newinventory = new Inventory();
        System.out.println("An Inventory has been created");

        //Add the basic items to the inventory
        newinventory.BasicInventory();
        System.out.println("Basic items have been added to the inventory");

        //This adds the Sword Item object to the Array
        newinventory.items.add(ns);
        System.out.println("Added the Offensive item to the inventory");

        //This adds the Health Item object to the Array
        newinventory.items.add(nh);
        System.out.println("Added the Health item to the inventory");

        //This adds the Space Suit object to the Array
        newinventory.items.add(newsuit);
        System.out.println("Added the Space Suit to the inventory");

        //Display the number of items in the inventory
        newinventory.InventorySize();

        //Display each item within the inventory individually
        newinventory.InventoryList();

        //Remove an item
        newinventory.InventoryRemove();

        //Confirm new inventory list
        newinventory.InventoryList();

    }

}