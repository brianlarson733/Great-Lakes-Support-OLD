package mercury.core.beings;

public abstract class BasicBeing {
    private String name;
    private int health;
    //private BasicRoom location;

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int newHealth){
        this.health = newHealth;
    }
    //getter method for location

    //setter method for location

    //Constructors for all instance variables

    abstract public void interact();

    /*public int changeHealth(){
        } */

    //Change location class

}
