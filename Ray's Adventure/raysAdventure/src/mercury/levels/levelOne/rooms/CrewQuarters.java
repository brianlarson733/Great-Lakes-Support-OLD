package mercury.levels.levelOne.rooms;

public class CrewQuarters extends BasicRoom {

    //Constructor for CrewQuarters
    public CrewQuarters() {
        super(new ArrayList<BasicItem>(), new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>(),
                "This is a closet sized room with a blanket roll, a pillow, and a dog-eared paperback novel on the floor.", "Crew Quarters");
    }
}