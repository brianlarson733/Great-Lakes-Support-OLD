package mercury.core;

import java.util.Random;
import java.util.Scanner;

import main.Game;
import misc.Tools;
import mercury.being.*;
import mercury.items.*;
import mercury.room.*;

public abstract class BasicLevel {
	
	//end game condition
	public static boolean endGame;
	public static boolean userWins;

	//constructor for BasicLevel
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
	 */
	public static void endLevel(Ray ray, boolean userWins) {
		if(ray.health <= 0){
			System.out.println("Oh no! You've suffered a mortal wound! As the world fades to black, your last thought is,"
				+ " 'Maybe I shoul'dve commited my code more regularly...'");
			endGame = true;
		}
		else if(ray.health > 0 && userWins == true){
			System.out.println(victoryText);
			System.out.println("Success! You've completed this level!");
			System.out.println("Please save the following Code to move on to the next level.")
			System.out.println("You can also use this code to return to the next level the next time you start the game")
			System.out.println(levelCode);

		}

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
	public abstract void makeDecision() {		
	
	}

}

