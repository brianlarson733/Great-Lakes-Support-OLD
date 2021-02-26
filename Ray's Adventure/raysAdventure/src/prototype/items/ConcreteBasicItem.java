package prototype.items;

import prototype.core.BasicItem;

public class ConcreteBasicItem extends BasicItem {
    public ConcreteBasicItem(String description, String name){
        //invoking base class Constructor
        super(description, name);

    }

    //Item Methods
    public static void listItems(){
        System.out.println("This methods lists the items within the item arraylist");
    }

    public void useItem(){
        //This will use the item for its context
        System.out.print("This method invokes the item's action");
    }

    public void dropItem(){
        //This will drop the item from the user's inventory
        System.out.print("Item has been dropped");
    }

    public void pickUpItem(){
        //This will add the target item to the user's inventory
        System.out.print("Item has been added to the character's inventory");
    }
}
