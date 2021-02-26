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

}
