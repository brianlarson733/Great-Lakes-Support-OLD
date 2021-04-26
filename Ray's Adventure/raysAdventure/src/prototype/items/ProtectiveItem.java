package prototype.items;

import prototype.core.BasicItem;

public class ProtectiveItem extends ConcreteBasicItem {
    public ProtectiveItem(String description, String name){
        //invoking base class Constructor
        super(description, name);
    }
    @Override public String toString(){
        return ("Protective Item: " + super.toString());
    }
}