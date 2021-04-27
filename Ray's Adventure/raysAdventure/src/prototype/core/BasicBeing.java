package prototype.core;

public abstract class BasicBeing {
    
    private String name;
    private String description;
    private int health;
    private BasicRoom location;

    public BasicBeing(String name, String description, int health,
                        BasicRoom location){
    	this.name = name;
    	this.description = description;
    	this.health = health;
        this.location = location;
    }

    public void printDescription(){
        System.out.println(description);
    }
    
    public BasicRoom getLocation() {
    	return this.location;
    }

    public String getName() {
    	return this.name;
    }
    
    public int getHealth() {
    	return this.health;
    }
    
    public void changeLocation(BasicRoom newLocation) {
    	this.location = newLocation;
    }
    
    public void changeHealth(int change) {
    	this.health += change;
    	if(this.getHealth()<=0) {
    		this.getLocation().removeBeing(this);
    		System.out.println(this.name + " is dead!");
    	}
    }
    
    abstract public void interact();
}
