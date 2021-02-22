package prototype.core;
import java.util.*;
import prototype.core.*;

public class BasicRoom {

	//Instance Variables for BasicRoom
	public static String description;
	public static String name;

	//Constructor for BasicRoom
	public BasicRoom(String description, String name) {
		this.description = description;
		this.name = name;
	}

	public static void getDescription(){
		System.out.println(description);
	}

	public void getName(){
		System.out.println(name);
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
