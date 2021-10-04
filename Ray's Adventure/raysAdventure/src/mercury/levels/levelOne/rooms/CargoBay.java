package mercury.levels.levelOne.rooms;

import java.util.ArrayList;

import mercury.core.beings.BasicBeing;
import mercury.core.items.BasicItem;
import mercury.core.rooms.BasicRoom;

public class CargoBay extends BasicRoom {

    //Constructor for CargoBay
    public CargoBay() {
        super(new ArrayList<BasicItem>(), new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>(),
                "This is an expansive room where all the cargo goes.", "Cargo Bay");
    }
}