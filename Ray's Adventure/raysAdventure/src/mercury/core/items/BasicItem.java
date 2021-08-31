package mercury.core;

public abstract class BasicItem {
    //Item fields
    public String description;
    public String name;



    //Item Constructor
    public BasicItem(String name, String description) {
        description = setDescription(description);
        name = setName(name);
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public String setDescription(String description){
        this.description = description;
    }

    public String setName(String name){
        this.name = name;
    }

    //use() method to use item functionality
    public abstract void use(){
    }

}
