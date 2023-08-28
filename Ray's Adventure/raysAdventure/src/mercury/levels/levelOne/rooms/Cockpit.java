package mercury.levels.levelOne.rooms;

import java.util.ArrayList;

import mercury.core.beings.BasicBeing;
import mercury.core.items.BasicItem;
import mercury.core.rooms.BasicRoom;

public class Cockpit extends BasicRoom {

    //Constructor for Cockpit
    public Cockpit() {
        super(new ArrayList<BasicItem>(), new ArrayList<BasicItem>(), new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>(),
                "This is a small, semi-circular room filled with control panels covered in buttons, blinking lights, and switches. A domed window gives a view of the outside.", "Cockpit");
    }
}
