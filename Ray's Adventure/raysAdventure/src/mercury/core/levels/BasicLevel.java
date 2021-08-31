package mercury.core;

import java.util.Random;
import java.util.Scanner;

import main.Game;
import misc.Tools;
import mercury.being.Alloy;
import mercury.being.Ray;
import mercury.being.Bug;
import prototype.items.ConcreteBasicItem;
import prototype.items.Inventory;
import prototype.items.BugHammer;
import prototype.room.*;

public abstract class BasicLevel {
	
	//end game condition
	public static boolean endGame;
	public static boolean userWins;

	public BasicLevel(boolean endGame, boolean userWins){
		this.endGame = false;
		this.userWins = false;
	}

	/**
	 * This method is called to start the Level
	 */
    public abstract void startLevel() {

    }

    /**
	 * This method is called to end the game
	 * @param being is the being that just died, determining how the game ends
	 */
	public static void endLevel(BasicBeing being) {
		if(being instanceof Ray) {
			System.out.println("How sad, Ray's space adventures have come to an end!");			
		}
		else if(being instanceof Bug) {
			System.out.println("Our hero has saved the day, hurrah! Now work can"
					+ " begin on all \nthose ship feature requests you've "
					+ "been receiving from Alloy...");
		}
		endGame = true;
	}
	
	/**
	 * This provides transition text for easier reading
	 */
	public static void transitionText() {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Press 'Enter' to continue");
		scan.nextLine();
		
	}

	/**
	 * This allows the user to make choices and advance through the game
	 */
	public void makeDecision(Ray ray, Alloy alloy, Bug bug, Inventory rayInventory) {
		
	
	}

}

