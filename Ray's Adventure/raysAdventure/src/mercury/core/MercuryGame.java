package mercury.core;
import java.util.*;

import main.Game;
import misc.Tools;

public class MercuryGame extends Game {

		private ArrayList<Integer> levelCodes = new ArrayList<Integer>();

		levelCodes.add(5313);
		levelCodes.add(9913);
		levelCodes.add(8543);
				
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
		public void levelSelector() {
			System.out.println("Which level would you like to choose?");
			String[] choices = {"Level 1", "Level 2", "Level 3", "Exit"};
			int levelChoice = Tools.getWholeNumberInput(choices);
			
			System.out.println("Please enter the code for " + choices[levelChoice].toLowerCase());
			
			int levelCodeInput = Tools.getWholeNumberInput();
			
			switch (levelCodeInput) {
			case 5313:
				LevelOne.startLevel();
				break;
			
			case 9913:
				LevelTwo.startLevel();
				break;
			
			case 8543:
				LevelThree.startLevel();
				break;
			
			case 4:
				break;
			
			}
	}
}
