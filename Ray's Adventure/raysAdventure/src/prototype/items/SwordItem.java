package prototype.items;

//This class serves as a proof of concept for setting values within the derived class
public class SwordItem extends ConcreteBasicItem {

    public SwordItem(){
        super("Light glints off of the monomolecular edge", "Excaliber MKII");
    }

    @Override public String toString(){
        return ("SWORD ITEM: " + super.toString());
    }

    //Test BasicItem method invocation
    //ConcreteBasicItem.listItems();
}
