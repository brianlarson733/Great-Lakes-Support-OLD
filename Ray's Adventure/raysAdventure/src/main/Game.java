package main;

import java.util.ArrayList;

/**
 * This class is the parent class for all games (currently the prototype and Mercury).
 * @author blars 
 */
public abstract class Game {

	/**
	 * Start the game.
	 */
	public abstract void startGame();
	
	/**
	 * This contains codes for advancing through levels.
	 */
	private ArrayList<Integer> levelCodes = new ArrayList<Integer>();
	

}
