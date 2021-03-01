package prototype.core;

import main.Game;
import misc.Tools;
import prototype.being.Alloy;
import prototype.being.Ray;

public class PrototypeGame extends Game {
	
    public void startGame() {
        Ray ray = new Ray();
        Alloy alloy = new Alloy();
        
        System.out.println("You find yourself waking up on a vacant-looking space ship:");
        System.out.println("You are full of questions, what do you want to do?");
        
        ray.makeChoice();
        
        System.out.println("That was exciting, thanks for playing!");
    }
}
