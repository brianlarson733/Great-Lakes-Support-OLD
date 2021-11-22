package mercury.core.beings;

import java.util.ArrayList;
import mercury.core.items.BasicItem;
import mercury.core.rooms.BasicRoom;
import misc.Tools;


public class Ray extends BasicBeing {


    /** Creates Array for Ray's inventory */
    public ArrayList<BasicItem> rayInventory = new ArrayList<BasicItem>();

    /**
     * Constructors for all instance variables
     *
     * @param name
     * @param health
     * @param location
     */
    public Ray(BasicRoom location) {
        super("Ray", 100, location);
    }

    /**
     * This method is not called as Ray doesn't need to interact with Ray
     */
    public void interact() {}

    /** Change location override from mercury BasicBeing
     * @param newLocation
     */
    @Override
    public void changeLocation(BasicRoom newLocation) {
        super.changeLocation(newLocation);
    }

    /** 
     * pickUpItem - Remove item from current room’s items, Add item to Ray’s inventory
     */
    public void pickUpItem(BasicRoom location) {

        this.location.printItems();
        System.out.println();
        System.out.println("Please identify the item you would like to pick up from this room.");
        System.out.println();
        
        int userChoice = 0;
        
        while(true) {
        	
        	userChoice = Tools.getWholeNumberInput();
        	
        	if (userChoice < this.location.getItemSize()) {
        		break;
        	}
        	System.out.println("Sorry, that isn't a valid option");
        }
        
        rayInventory.add(this.location.getItem(userChoice-1));
        this.location.removeItem(userChoice-1);

        System.out.println();
        inspectInventory();
        System.out.println();
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
        


    //dropItem - Remove item from Ray’s inventory, Add item to current room’s items
        //Modify the code from Prototype-Inventory

    public void useItem(BasicRoom location){

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
            System.out.println("Please identify the item you would like to use from Ray's inventory");
            System.out.println();

            int itemUse = Tools.getWholeNumberInput();

            //I don't know how the following line works but it does
            rayInventory.get(itemUse).use();
            System.out.println();
    }


    public void inspectInventory(){
        if(rayInventory.size() == 0){
            System.out.println("Ray isn't carrying any items!");
            }
        
        else{
        	System.out.println("Ray's inventory contains:");
	    	for (int i = 0; i < rayInventory.size(); i++) {
	    		System.out.println((i+1) + ") " + rayInventory.get(i).name + ": " + rayInventory.get(i).description);
	    	}
        	
        }
    }


    /** Ray being class
     *  This needs to extend the BasicBeing changehealth class
     *  and include code for ending the game if Ray dies*/

    public void rayChangeHealth() {
       //Check to confirm if this method is needed
    }
}

