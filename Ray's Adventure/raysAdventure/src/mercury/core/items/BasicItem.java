package mercury.core.items;

public abstract class BasicItem {
    //Item fields
    public String description;
    public String name;
    public boolean edible;
    public boolean stationary;


    //Item Constructor
    public BasicItem(String name, String description) {
        this.description = description;
        this.name = name;
    }


    //use() method to use item functionality
    abstract public void use();

}
