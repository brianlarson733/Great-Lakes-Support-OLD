package mercury.levels.levelOne.rooms;

import java.util.ArrayList;

import mercury.core.beings.BasicBeing;
import mercury.core.items.BasicItem;
import mercury.core.rooms.BasicRoom;

public class EngineRoom extends BasicRoom {

    //Constructor for EngineRoom
    public EngineRoom() {
        super (new ArrayList<BasicItem>(), new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>(),
                "This room hums with the constant vibration of the ship's engine, which takes up nearly all the available space.", "Engine Room");
    }
}