package prototype.items;

import prototype.core.BasicItem;

public class EquipmentItem extends BasicItem {
    public EquipmentItem (String description, String name){
        //invoking base class Constructor
        super(description, name);
    }
    @Override public String toString(){
        return ("EQUIPMENT: " + super.toString());
    }
}