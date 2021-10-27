package main;
import prototype.core.*;
import mercury.core.MercuryGame;
import misc.*;

public class GameSelector {

    public static void main (String[] args) {

    	PrototypeGame prototype = new PrototypeGame();
    	MercuryGame mercury = new MercuryGame();
    	
        System.out.println();
    	System.out.println("This is the driver class for testing of game modules for" +
                " the Great Lakes CSE game project");
        System.out.println();
        System.out.println("Welcome to Ray's Adventures!");
        System.out.println();
        System.out.println();
        System.out.println("Please choose an adventure below:");
        System.out.println("1 - Prototype");
        System.out.println("2 - Mercury");
        System.out.println("3 - The Secret of the Diamond Bar Basement \n");
        int[] tempArray = {1, 2, 3};
        int choice = Tools.getWholeNumberInput(tempArray);

        switch (choice) {
                case 1:
                    prototype.startGame();
                    break;
                case 2:
                    mercury.startGame();
                case 3:
                	System.out.println("There is no Diamond Bar basement...or is there.....");
                    break;
                default:
                    break;
                }

    }
}