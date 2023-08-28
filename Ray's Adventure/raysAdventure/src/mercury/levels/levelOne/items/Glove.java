package mercury.levels.levelOne.items;

import mercury.core.items.BasicItem;

public class Glove extends BasicItem {
	
	Boolean wearingGlove;
	
	public Glove() {
        super ("Glove", "This thick looking glove appears treated to withstand sharp objects.");
        wearingGlove = false;
	}

    public void use(){
    }
}
