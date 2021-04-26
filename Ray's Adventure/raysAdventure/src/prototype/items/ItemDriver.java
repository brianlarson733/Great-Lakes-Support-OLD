/*
This class is a driver for testing of the item system
Currently this class initiates a new ArrayList
Then add both the Basic items in Ray's inventory to the list
As well as Offensive, Protective, and Health items

To do:
Add an Accessory items class

 */


package prototype.items;

public class ItemDriver {
    public static void main(String args[]) {

        OffensiveItem ns = new OffensiveItem();
        //System.out.println(ns);

        HealthItem nh = new HealthItem("The item appears as a perfect glass sphere with a red liquid inside",
                "Restorationation");
        //System.out.println(nh);

        SpaceSuitItem newsuit = new SpaceSuitItem("The space suit has a faded white and blue " +
                "checkered pattern", "Portal 6.0");
        //System.out.println(newsuit);

        //Create the array object
        Inventory newinventory = new Inventory();

        //Add the basic items to the inventory
        newinventory.BasicInventory();

        //This adds the Sword Item object to the Array
        newinventory.items.add(ns);

        //This adds the Health Item object to the Array
        newinventory.items.add(nh);

        //This adds the Space Suit object to the Array
        newinventory.items.add(newsuit);

        //Display the number of items in the inventory
        newinventory.InventorySize();

        //Display each item within the inventory individually
        newinventory.InventoryList();

        //Remove the 0 item
        //newinventory.InventoryRemove();
    }

}