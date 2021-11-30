package mercury.levels.levelOne.items;
import mercury.core.items.BasicItem;

public class Book extends BasicItem {

    public boolean edible = true;

    //constructor for Book
    public Book() {
        super ("Book", "A little paperback novel that you've been working through for far too long.");
    }

    //use() method to use item functionality
    public void use(){
    }
}