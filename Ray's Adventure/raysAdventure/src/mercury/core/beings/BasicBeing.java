package mercury.core.beings;

import mercury.core.rooms.BasicRoom;

public abstract class BasicBeing {
    public String name;
    private int health;
    public BasicRoom location;

    /** Getter for Health */
    public int getHealth(){
        return this.health;
    }

    public BasicRoom getLocation(){
        return this.location;
    }

    /** Setter for Location
    public void setLocation (BasicRoom newLocation){
        this.location = newLocation;
    } */

    /** Constructors for all instance variables */
    public BasicBeing (String name, int health, BasicRoom location){
        this.name = name;
        this.health = health;
        this.location = location;
    }

    /** Interact abstract method */
    abstract public void interact();

    /** Change Health
     * This needs to be expanded
     * If the being's health drops to 0 or below 0 the being
     * needs to be removed from the location's beings list*/
    public void changeHealth(int change) {
        this.health += change;
    }

    /** Change location class */
    public void changeLocation(BasicRoom newLocation) {
        this.location.removeBeing(this);
        this.location = newLocation;
        this.location.addBeing(this);
    }

}
