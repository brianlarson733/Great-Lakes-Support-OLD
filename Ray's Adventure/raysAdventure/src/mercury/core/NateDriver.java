/* This is a Driver class for testing of Nate's code */

package mercury.core;

import mercury.core.beings.Ray;
import mercury.core.rooms.BasicRoom;
import mercury.core.beings.BasicBeing;
import mercury.core.items.BasicItem;

import java.util.ArrayList;

public class NateDriver {

    public class TestingRoom extends BasicRoom {
        public TestingRoom(ArrayList<BasicItem> items, ArrayList<BasicBeing> beings, ArrayList<BasicRoom> doors, String description, String name) {
            super(items, beings, doors, description, name);
        }

    }

    BasicRoom testRoom = new TestingRoom();
    Ray testRay = new Ray("testRay", 100, testroom);


    public static void main(String args[]) {

    }
}
