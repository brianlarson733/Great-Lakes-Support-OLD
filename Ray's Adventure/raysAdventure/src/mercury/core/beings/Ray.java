package mercury.core.beings;

import mercury.core.items.BasicItem;
import mercury.core.levels.BasicLevel;
import mercury.core.rooms.BasicRoom;
import misc.Tools;

import java.util.ArrayList;

import static mercury.core.levels.BasicLevel.endLevel;


public class Ray extends BasicBeing {


    /** Creates Array for Ray's inventory */
    public ArrayList<BasicItem> rayInventory = new ArrayList<BasicItem>();

    public Alloy alloy;

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
     * printInventory - Look at Ray's Items
     */
    public void printInventory(){
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


    /** 
     * pickUpItem - Remove item from current room’s items, Add item to Ray’s inventory
     */
    public void interactWithItem() {

        //accounts for edge cases where room is empty
        if (this.location.getItemsSize() == 0) {
            System.out.println("This room is empty");
        } else {

            this.location.printItems();
            System.out.println();
            System.out.println("Please identify the item you would like to inspect in this room.");
            System.out.println();

            // userChoice lets the user select an item numerically from the room's items
            int userChoice = 0;

            // this forever loop ensures that the user selects a valid number
            while (true) {

                userChoice = Tools.getWholeNumberInput();

                if (userChoice <= this.location.getItemsSize()) {
                    break;
                }
                System.out.println("Sorry, that isn't a valid option.");
            }

            //print out item name and description
            System.out.println();
            System.out.println(this.location.getItem(userChoice - 1).name);
            System.out.println(this.location.getItem(userChoice - 1).description);

            // check if the item is stationary
            if (this.location.getItem(userChoice - 1).stationary = true)  {
                System.out.println("This item is stationary. Would you like to use it?");
                System.out.println();
                String[] useChoices = {"Yes", "No"};
                int useChoice = Tools.getWholeNumberInput(useChoices);

                if (useChoice == 1) {
                    this.location.getItem(userChoice - 1).use();
                }
            }

            // adds userChoice to Ray's inventory and removes it from the room's items
            else {
                System.out.println("Would you like to add this item to your inventory?");
                System.out.println();
                String[] addChoices = {"Yes", "No"};
                int addChoice = Tools.getWholeNumberInput(addChoices);

                if (addChoice == 1) {
                    rayInventory.add(this.location.getItem(userChoice - 1));
                    this.location.removeItem(userChoice - 1);
                }
            }

// prints out Ray's inventory
            System.out.println();
            printInventory();
            BasicLevel.transitionText();

        }
    }

    /**
     * dropItem - Remove item from Rays’s items, Add item to current room’s inventory
     */
    public void dropItem() {

        //accounts for edge cases where Ray's inventory is empty
        if (rayInventory.size() == 0) {
            System.out.println("Sorry, Ray doesn't currently have any items");
        } else {

            printInventory();
            System.out.println();

            System.out.println("Please identify the item you would like to drop");
            System.out.println();

            // similar userChoice variable as above
            int userChoice = 0;

            while (true) {

                userChoice = Tools.getWholeNumberInput();

                if (userChoice <= rayInventory.size()) {
                    break;
                }
                System.out.println("Sorry, that isn't a valid option");
            }
            // grab the object reference to item that will be dropped
            BasicItem itemToDrop = rayInventory.get(userChoice - 1);

            getLocation().addItem(itemToDrop);
            rayInventory.remove(itemToDrop);

            // confirm item removal
            System.out.println("Okay, you dropped " + itemToDrop.name);

        }
    }

    /**
     * useItem - Uses an item from Ray's inventory
     */

    public void useItem() {

        //accounts for edge cases where Ray's inventory is empty
        if (rayInventory.size() == 0) {
            System.out.println("Sorry, Ray doesn't currently have any items");
        } else {

        	//	first inspect the inventory

            printInventory();
            System.out.println();
            System.out.println("Please identify the item you would like to use from Ray's inventory");
            System.out.println();

// Use userChoice variable from above to ensure that the user input is valid
            int userChoice = 0;

            while (true) {

                userChoice = Tools.getWholeNumberInput();

                if (userChoice <= rayInventory.size()) {
                    break;
                }
                System.out.println("Sorry, that isn't a valid option");
            }

//I changed this line to include the userChoice variable from above
            rayInventory.get(userChoice - 1).use();
            System.out.println();
        }
    }



    /**
     * listEdible - List's edible items within Ray's inventory
     */
        public void edibleInteraction(){

            //This creates an integer to keep track of the number of edible item's in Ray's inventory
            int edibleCount = 0;

            //This lists out the edible item's within Ray's inventory
            System.out.println("Alloy can eat the following items:");
            for (int i = 1; i < getLocation().getItemsSize(); i++) {
                System.out.print("    ");
                System.out.print(i + ": ");
                if (rayInventory.get(i).edible == true) {
                    System.out.println(rayInventory.get(i));
                    edibleCount = edibleCount+1;
                }
            }

            //This asks for user input and checks against the number of edible items
            System.out.println();
            System.out.println("Which item should Alloy eat?");

            int edibleChoice = 0;
            while(true) {
                edibleChoice = Tools.getWholeNumberInput();
                if (edibleChoice <= edibleCount) {
                    break;
                }
                System.out.println("Sorry, that isn't a valid option");
            }

            // grab the object reference to item that will be dropped
            BasicItem itemToConsume = rayInventory.get(edibleChoice-1);

            //This confirms the item that Alloy eats
            System.out.println("Alloy eats the " + itemToConsume.name);

            //This removes the consumed item from Ray's inventory
            rayInventory.remove(itemToConsume);
        }



    /** Ray being class
     *  This needs to extend the BasicBeing setHealth class
     *  and include code for ending the game if Ray dies*/

    public void rayChangeHealth(int i) {
       changeHealth(i);
       if (this.getHealth() <= 0) {
           //this doesn't work because we can't call a levelCode here
           endLevel(false);
       }
    }
}

