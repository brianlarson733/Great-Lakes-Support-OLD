package mercury.levels.levelOne.rooms;

public class EngineRoom extends StorageArea {

    //Constructor for StorageArea
    public StorageArea() {
        super (new ArrayList<BasicItem>(), new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>(),
                "This is a little extra space for a little extra stuff.", "Storage Area");
    }
}