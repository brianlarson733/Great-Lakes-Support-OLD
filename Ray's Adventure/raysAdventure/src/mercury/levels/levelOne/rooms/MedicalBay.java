package mercury.levels.levelOne.rooms;

public class MedicalBay extends BasicRoom {

    //Constructor for MedicalBay
    public MedicalBay() {
        super(new ArrayList<BasicItem>(), new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>(),
                "This stainless steel room spakles and smells of iodine. In the center of the room there's an elevated slab as long as a body. Cupboards line the walls.", "Medical Bay");
    }
}