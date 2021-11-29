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
        	
        	if (userChoice <= this.location.getItemsSize()) {
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

        inspectInventory();
        System.out.println();

        System.out.println("Please identify the item you would like to drop");
        System.out.println();

        int userChoice = 0;
        
        while(true) {
        	
        	userChoice = Tools.getWholeNumberInput();
        	
        	if (userChoice <= rayInventory.size()) {
        		break;
        	}
        	System.out.println("Sorry, that isn't a valid option");
        }
        
        BasicItem itemToDrop = rayInventory.get(userChoice-1);
        
        getLocation().addItem(itemToDrop);
        rayInventory.remove(itemToDrop);
        System.out.println("Okay, you dropped " + itemToDrop.name);
           
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

