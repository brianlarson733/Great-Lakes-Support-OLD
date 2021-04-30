package main;
import prototype.core.*;
import misc.*;

public class GameSelector {

    public static void main (String[] args) {

    	PrototypeGame prototype = new PrototypeGame();
    	
        System.out.println();
    	System.out.println("This is the driver class for testing of game modules for" +
                " the Great Lakes CSE game project");
        System.out.println();
        System.out.println("Welcome to Ray's Adventures!");
        System.out.println();
        System.out.println();
        System.out.println("Please choose an adventure below:");
        System.out.println("1 - Prototype");
        System.out.println("2 - The Secret of the Diamond Bar Basement \n");
        int[] tempArray = {1, 2};
        int choice = Tools.getWholeNumberInput(tempArray);
        System.out.println(".");
        System.out.println(".");
        System.out.println("... The Adventure begins!");
        System.out.println(".");
        System.out.println(".");
        
        switch (choice){
            case 1:
                prototype.startGame();
                break;
            case 2:
                System.out.println("There is no Diamond Bar basement...or is there.....");
                break;
            default:
                break;
        }



    }
}