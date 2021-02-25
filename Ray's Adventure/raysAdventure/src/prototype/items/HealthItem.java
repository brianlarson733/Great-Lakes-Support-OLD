package prototype.items;

import prototype.core.BasicItem;
//This class serves as a proof of concept for a derived class that gives a template for the output
public class HealthItem extends BasicItem {
    public HealthItem(String description, String name){
        //invoking base class Constructor
        super(description, name);
    }
    @Override public String toString(){
        return ("HEALTH ITEM: " + super.toString());
    }
}
