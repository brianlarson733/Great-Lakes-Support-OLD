package prototype.core;
import java.util.*;

public abstract class BasicRoom {

	//Instance Variables for BasicRoom
	public String description;
	public String name;
	public String entryNarration;

	//Constructor for BasicRoom
	public BasicRoom(String description, String name, String entryNarration) {
		this.description = description;
		this.name = name;
		this.entryNarration = entryNarration;
	}

	public void printDescription(){
		System.out.println(description);
	}

	public void printName(){
		System.out.println(name);
	}

	public void printentryNarration(){
		System.out.println(entryNarration);
	}


//    static void entryRoom(){
  //      System.out.println("Waking up from cold sleep the room around you is full of other cryocanisters");
    //    System.out.println("After slowly making your way out of your own canister you walk to your friends");
      //  System.out.println("And realize that it is empty...");
        //System.out.println("..");
        //System.out.println(".");
        //System.out.println("\r\n");
        //basicBeing.alloyBeing();
    //}
}
