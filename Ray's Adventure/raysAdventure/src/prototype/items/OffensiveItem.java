package prototype.items;

//This class serves as a proof of concept for setting values within the derived class
public class OffensiveItem extends ConcreteBasicItem {

    public OffensiveItem(){
        //super("Light glints off of the monomolecular edge", "Excaliber MKII");
        super("Light glints of it's flat edge", "Bughammer");
        }

    @Override public String toString(){
        return ("Offensive Item: " + super.toString());
    }

}
