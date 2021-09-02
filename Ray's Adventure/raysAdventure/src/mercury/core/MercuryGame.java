package mercury.core;
import java.util.*;

import main.Game;
import mercury.levels.levelOne.LevelOne;
import misc.Tools;

public class MercuryGame extends Game {

	private int[] levelCodes = new int[] {5313,9913,8543};
	
	private LevelOne levelOne = new LevelOne();
	
	public void startGame() {
			
		System.out.println("Welcome to the Mercury game! A solar system of adventure awaits.");
		String[] choices = {"Start the adventure from the beginning", "Enter a level code", "Exit"};
		int userInput = Tools.getWholeNumberInput(choices);
			
		switch (userInput) {
		case 1:
			LevelOne.startLevel();
			break;
		case 2:
			levelSelector();
			break;
		case 3:
			break;
		}
		
	}

	@Override
	public void levelSelector(LevelOne levelOne, LevelTwo levelTwo, LevelThree levelThree) {
		System.out.println("Which level would you like to choose?");
		String[] choices = {"Level 1", "Level 2", "Level 3", "Exit"};
		int levelChoice = Tools.getWholeNumberInput(choices);
		
		//user wants to exit game
		if(levelChoice == 4) {
			break;
		}
		
		System.out.println("Please enter the code for " + choices[levelChoice].toLowerCase());
			
		int userCodeInput = Tools.getWholeNumberInput();
			
		switch (userCodeInput) {
		case 5313:
			levelOne.startLevel();
			break;
			
		case 9913:
			levelTwo.startLevel();
			break;
			
		case 8543:
			levelThree.startLevel();
			break;
			
		default:
			System.out.println("Sorry, that isn't a valid level code.");
			break;
		}
	}
}
