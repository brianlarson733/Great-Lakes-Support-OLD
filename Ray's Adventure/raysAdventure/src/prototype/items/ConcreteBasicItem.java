package prototype.items;

import prototype.core.BasicItem;

public class ConcreteBasicItem extends BasicItem {
    public ConcreteBasicItem(String description, String name){
        //invoking base class Constructor
        super(description, name);

    }

    @Override
    public void useItem() {
        System.out.println("This is a test of the local AAHHHHHHHH");
    }
}
