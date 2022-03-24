package mercury.levels.levelOne.rooms;

import mercury.core.beings.BasicBeing;
import mercury.core.items.BasicItem;
import mercury.core.rooms.BasicRoom;

import java.util.ArrayList;

public class GarbageRoom extends BasicRoom {

    //Constructor for GarbageRoom
    public GarbageRoom() {
        super(new ArrayList<BasicItem>(), new ArrayList<BasicItem>(), new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>(),
                "This closet-sized room contains the garbage chute.", "Garbage room");
    }
}
