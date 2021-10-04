package mercury.levels.levelOne.rooms;

public class CargoBay extends BasicRoom {

    //Constructor for CargoBay
    public CargoBay() {
        super(new ArrayList<BasicItem>(), new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>(),
                "This is an expansive room where all the cargo goes.", "Cargo Bay");
    }
}