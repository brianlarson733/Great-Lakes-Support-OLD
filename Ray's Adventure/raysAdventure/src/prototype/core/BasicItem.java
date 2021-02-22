package prototype.core;

class BasicItem {
    //Item fields
    public String description;
    public String name;

    //Item Constructor
    //public BasicItem(String description, String name) {

    //}

    public BasicItem() {
        this.description = description;
        this.name = name;
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
            //This will add the target item to the user's investory
            System.out.print("Item has been added to the character's inventory");
        } */
    }

//derived class
    class SwordItem extends BasicItem {
        //SwordItem gets an additional field
        public boolean shiny;

        //Constructor
        public SwordItem(String description, String name) {
            super();
        }
    }