package prototype.items;

public class ItemDriver {
    public static void main(String args[]) {

        SwordItem ns = new SwordItem();
        System.out.println(ns);

        HealthItem nh = new HealthItem("The item appears as a perfect sphere with a red liquid inside",
                "Restorationation");
        System.out.println(nh);

        SpaceSuitItem newsuit = new SpaceSuitItem("The space suit has a faded white and blue " +
                "checkered pattern", "Portal 6.0");
        System.out.println(newsuit);

        //Create the array object
        Inventory newinventory = new Inventory();

        //Add the sample items to the inventory
        newinventory.Inventory();

        //Display the number of items in the inventory
        newinventory.InventorySize();

        //Display each item within the inventory individually
        newinventory.InventoryList();

        //Remove the 0 item
        //newinventory.InventoryRemove();


    }
}