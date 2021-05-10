/*
This class is a driver for testing of the item system
Currently this class initiates a new ArrayList
Then add both the Basic items in Ray's inventory to the list
As well as Offensive, Protective, and Health items

To do:


Bug: the Tools.getWholeNumberInput() method and the Arrays don't align perfectly. IE 0 is not a positive number
        as a result it is not possible to modify the first item in an array using the method

 */


package prototype.items;

import misc.Tools;
import prototype.being.Ray;
import prototype.room.CockpitRoom;

public class ItemDriver {
    public static void main(String args[]) {

        BugHammer ns = new BugHammer();

        HealthItem nh = new HealthItem("Restorationation", "The item appears as a perfect glass sphere with a red liquid inside"
        );

        SpaceSuitItem newsuit = new SpaceSuitItem("Portal 6.0", "The space suit has a faded white and blue " +
                "checkered pattern");


        System.out.println("What do you want to do?");
        System.out.println("1. Demonstrate creating an array and sub-methods");
        System.out.println("2. Demonstrate how to move items between inventories (arrays)");
        System.out.println("3. Demonstrate using a method to pick up an item");
        System.out.println("4. Demonstrate using a method to drop an item");
        int choice = Tools.getWholeNumberInput();

        if (choice == 1) {
            System.out.println("This is a POC for creating arrays and using methods within the array parent class");

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

        if (choice == 2) {
            //POC - Testing moving objects between arrays
            System.out.println("This is a POC of how to move items between two Arrays");

            //Spacing - this is expandable and from StackOverFlow :D
            for (int i = 0; i < 1; ++i) System.out.println();

            //Create first array
            Inventory inventoryOne = new Inventory();
            inventoryOne.BasicInventory();
            System.out.println("Inventory One has been created and contains:");
            inventoryOne.InventoryList();

            //Spacing - this is expandable and from StackOverFlow :D
            for (int i = 0; i < 1; ++i) System.out.println();

            //Create second array
            Inventory inventoryTwo = new Inventory();
            //inventoryTwo.BasicInventory();
            inventoryTwo.items.add(newsuit);
            System.out.println("Inventory Two has been created and contains:");
            inventoryTwo.InventoryList();

            //Spacing - this is expandable and from StackOverFlow :D
            for (int i = 0; i < 1; ++i) System.out.println();

            //Removing an object from inventoryOne and adding it to Inventory two
            System.out.println("Please identify the item you would like to move from Inventory One" +
                    " to Inventory Two.");

            int choice2 = Tools.getWholeNumberInput();

            inventoryTwo.items.add(inventoryOne.items.get(choice2));
            inventoryOne.items.remove(choice2);

            System.out.println("");
            System.out.println("Inventory One now contains:");
            inventoryOne.InventoryList();
            System.out.println("");
            System.out.println("Inventory Two now contains:");
            inventoryTwo.InventoryList();
        }

        if (choice == 3) {
            System.out.println("Here we go...");
            //Creating local cockpit room and ray for this testing
            CockpitRoom cockpit = new CockpitRoom();
            Ray ray = new Ray(cockpit);

            //Instantiating Room Inventories:
            ConcreteBasicItem cockpitPamphlet = new ConcreteBasicItem("Pamphlet for the DXP Diamond Bar", "Colorful folded paper");
            ConcreteBasicItem cockpitSnack = new ConcreteBasicItem("DXP Diamond Bar Snacks!", "Hard candies in various shades of blue");
            ConcreteBasicItem cockpitBlank = new ConcreteBasicItem("Empty Space", "This is an empty space");
            cockpit.items.add(cockpitBlank);
            cockpit.items.add(cockpitPamphlet);
            cockpit.items.add(cockpitSnack);

            //Creating Ray's inventory
            Inventory rayInventory = new Inventory();
            rayInventory.BasicInventory();
            Inventory.InventoryPickup(ray, rayInventory);
        }

        if (choice == 4) {
            System.out.println("Here we go...");
            //Creating local cockpit room and ray for this testing
            CockpitRoom cockpit = new CockpitRoom();
            Ray ray = new Ray(cockpit);

            //Instantiating Room Inventories:
            ConcreteBasicItem cockpitPamphlet = new ConcreteBasicItem("Pamphlet for the DXP Diamond Bar", "Colorful folded paper");
            ConcreteBasicItem cockpitSnack = new ConcreteBasicItem("DXP Diamond Bar Snacks!", "Hard candies in various shades of blue");
            ConcreteBasicItem cockpitBlank = new ConcreteBasicItem("Empty Space", "This is an empty space");
            cockpit.items.add(cockpitBlank);
            cockpit.items.add(cockpitPamphlet);
            cockpit.items.add(cockpitSnack);

            //Creating Ray's inventory
            Inventory rayInventory = new Inventory();
            rayInventory.BasicInventory();
            Inventory.InventoryDrop(ray, rayInventory);
        }
    }
}