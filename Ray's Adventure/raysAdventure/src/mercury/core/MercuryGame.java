package mercury.core;
import main.Game;
import misc.Tools;

public class MercuryGame extends Game {

		public void startGame() {
			
			System.out.println("Welcome to the Mercury game! A solar system of adventure awaits. If you have a specific " +
					"level code you can enter it now. Otherwise, press 'enter' to start from the beginning.");
			
			//Provide pre-defined set of string choices. What the user inputs will happen.
			Tools.getWholeNumberInput();
			
			
		}

}
