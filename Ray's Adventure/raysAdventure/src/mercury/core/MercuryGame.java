package mercury.core;
import java.util.*;

import main.Game;
import mercury.levels.levelOne.LevelOne;
import mercury.levels.levelThree.LevelThree;
import mercury.levels.levelTwo.LevelTwo;
import misc.Tools;

public class MercuryGame extends Game {

	private LevelOne levelOne = new LevelOne();
	
	public void startGame() {
		
		System.out.println();
		System.out.println("Welcome to the Mercury game! A solar system of adventure awaits.");
		System.out.println();
		String[] choices = {"Start the adventure from the beginning", "Enter a level code", "Exit"};
		int userInput = Tools.getWholeNumberInput(choices);
			
		switch (userInput) {
		case 1:
			levelOne.startLevel();
			break;
		case 2:
			levelSelector();
			break;
		case 3:
			System.out.println("Okay, bye!");
			break;
		}
		
	}

	public static void levelSelector() {
		
		LevelOne levelOne = new LevelOne();
		LevelTwo levelTwo = new LevelTwo();
		LevelThree levelThree = new LevelThree();
		
		System.out.println("Which level would you like to choose?");
		String[] choices = {"Level 1", "Level 2", "Level 3", "Exit"};
		
		int levelChoice = Tools.getWholeNumberInput(choices);
		
		//user wants to exit game
		if(levelChoice == 4) {
			System.out.println("Okay, bye!");	
			return;
		}
		
		System.out.println("Please enter the code for " + choices[levelChoice-1].toLowerCase());
		int userCodeInput = Tools.getWholeNumberInput();
		
		if (levelChoice==1) {
			if (levelOne.levelCode==userCodeInput) {
				levelOne.startLevel();
			}
		}
		else if (levelChoice==2) {
			if (levelTwo.levelCode==userCodeInput) {
				levelTwo.startLevel();
			}
		}
		else if (levelChoice==3) {
			if (levelThree.levelCode==userCodeInput) {
				levelThree.startLevel();
			}	
		
		}
		
		else {
			System.out.println("Sorry, that isn't a valid level code.");
			return;
		}
	}
}
