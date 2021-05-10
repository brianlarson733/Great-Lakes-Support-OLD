package prototype.items;

//This class serves as a proof of concept for a derived class that gives a template for the output
public class HealthItem extends ConcreteBasicItem {
    public HealthItem(String name, String description){
        //invoking base class Constructor
        super(name, description);
    }
    /*@Override public String toString(){
        return ("Health Item: " + super.toString());
    }

     */
}
