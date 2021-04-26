package prototype.core;

public abstract class BasicItem {
    //Item fields
    public String description;
    public String name;


    //Item Constructor
    public BasicItem(String description, String name) {
        this.description = description;
        this.name = name;
    }

    //establishing toString() method to print info on the items
    public String toString()
    {
        return (description
                + " called "
                + name);
    }

       //Item Methods
        public abstract void useItem();

        public void dropItem(){
            //This will drop the item from the user's inventory
            System.out.print("Item has been dropped");
        }

        public void pickUpItem(){
            //This will add the target item to the user's inventory
            System.out.print("Item has been added to the character's inventory");
        }

}
