package prototype.core;

public abstract class BasicItem {
    //Item fields
    public String description;
    public String name;



    //Item Constructor
    public BasicItem(String name, String description) {
        description = getDescription();
        name = getName();
    }

    //use() method to use item functionality
    public abstract void use(){
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

}
