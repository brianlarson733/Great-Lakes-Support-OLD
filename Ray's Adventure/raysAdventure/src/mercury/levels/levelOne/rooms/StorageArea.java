package mercury.levels.levelOne.rooms;

import java.util.ArrayList;

import mercury.core.beings.BasicBeing;
import mercury.core.items.BasicItem;
import mercury.core.rooms.BasicRoom;

public class StorageArea extends BasicRoom {

    //Constructor for StorageArea
    public StorageArea(String name) {
        super (new ArrayList<BasicItem>(), new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>(),
                "This is a little extra space for a little extra stuff.", name);
    }
}