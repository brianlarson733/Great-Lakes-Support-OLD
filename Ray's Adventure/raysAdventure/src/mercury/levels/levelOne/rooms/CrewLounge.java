package mercury.levels.levelOne.rooms;

import java.util.ArrayList;

import mercury.core.beings.BasicBeing;
import mercury.core.items.BasicItem;
import mercury.core.rooms.BasicRoom;

public class CrewLounge extends BasicRoom {

    //Constructor for CrewLounge
    public CrewLounge() {
        super(new ArrayList<BasicItem>(), new ArrayList<BasicItem>(), new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>(),
                "This cozy room has a plush chair and a dart board that has seen better days.", "Crew Lounge");
    }
  
}