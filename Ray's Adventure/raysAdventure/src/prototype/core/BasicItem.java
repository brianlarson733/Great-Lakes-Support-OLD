package prototype.core;

public abstract class BasicItem {
    //Item fields
    public static String description;
    public static String name;

    //Item Constructor
    //public BasicItem(String description, String name) {

    //}

    public BasicItem(String description, String name) {
        this.description = description;
        this.name = name;
    }

    // overriding toString() method
    // of BasicItem to print more info
    @Override public String toString()
    {
        return (super.toString() + "is "
                + description
                + " it's name is "
                + name);
    }


    /*
       //Item Methods
        public void useItem{
            //This will use the item for its context
            System.out.print("This method invokes the item's action");
        }

        public void dropItem{
            //This will drop the item from the user's inventory
            System.out.print("Item has been dropped");
        }

        public void pickUpItem{
            //This will add the target item to the user's inventory
            System.out.print("Item has been added to the character's inventory");
        } */
    }
