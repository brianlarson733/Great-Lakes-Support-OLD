import java.util.*;

public abstract class BasicBeing {
    
    private String name;
    private String description;
    private int health;
    
    //public ArrayList<basicItem> items;
    //public basicRoom location;

    public BasicBeing(String name, String description, int health){
    	this.name = name;
    	this.description = description;
    	this.health = health;
    }

    public void printDescription(){
        System.out.println(description);
    }

}
