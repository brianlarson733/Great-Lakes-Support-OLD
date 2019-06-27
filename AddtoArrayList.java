/**
 * Problem 5 - Project Euler - Chicago Pod Project
 * This is the class to take the elements returned by each number and add them to the list
 * Will also need to account for extras or roots and their exponents
 */
import java.util.Scanner;
import java.util.ArrayList;

public class AddtoArrayList {

    ArrayList<Integer> parentList = new ArrayList<Integer>();      //create parent arraylist
    {
        parentList.add(1);                                                           
    }

    public static void store(ArrayList<Integer> elements) {        //take in the input array list and store
        
        ArrayList<Integer> uniqueElements = new ArrayList<Integer>();         //create arraylist for unique elements
        
        for(int i = 0;i<elements.size();i++){
            boolean addUnique = true;
            for(int j = 0;i<parentList.size();j++){
                if(elements.get(i) == parentList.get(j)){
                    addUnique = false;
                    break;
                }
            }

            if(addUnique == true){
                uniqueElements.add(elements.get(i));
            }
        }

        for(int k = 0;k<uniqueElements.size();k++){
            boolean addParent = false;
            for(int l = 0; l<parentList.size();l++){
                if(parentList.get(l) % uniqueElements.get(k) != 0){
                    addParent = true;
                } 
                else if(parentList.get(l) / uniqueElements.get(k) > 1){
                    addParent = true;
                }
            }

            if(addParent == true){
                parentList.add(uniqueElements.get(k));
            }
        }

        return parentList;
    }
}