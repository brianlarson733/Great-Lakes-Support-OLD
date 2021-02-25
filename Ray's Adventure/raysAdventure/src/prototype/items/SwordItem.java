package prototype.items;

import prototype.core.BasicItem;
//This class serves as a proof of concept for setting values within the derived class
public class SwordItem extends BasicItem {

    public SwordItem(){
        super("Light glints off of the monomolecular edge", "Excaliber MKII");
    }
    @Override public String toString(){
        return ("SWORD ITEM: " + super.toString());
    }
}
