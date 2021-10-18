package mercury.levels.levelOne.rooms;

import java.util.ArrayList;

import mercury.core.beings.BasicBeing;
import mercury.core.items.BasicItem;
import mercury.core.rooms.BasicRoom;

public class MainCorridor extends BasicRoom {

    //Constructor for MainCorridor
    public MainCorridor() {
        super (new ArrayList<BasicItem>(), new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>(),
                "This is a long, narrow hall flanked with doors to the other rooms on the ship.", "Main Corridor");
    }
}