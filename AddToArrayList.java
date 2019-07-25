/**
 * Problem 5 - Project Euler - Chicago Pod Project
 * This is the class to take the elements returned by each number and add them to the list
 * Will also need to account for extras or roots and their exponents
 */
import java.util.*;

public class AddToArrayList {


    public static void store(ArrayList<Integer> elements, ArrayList<Integer> parentList) {        //take in the input array list and store
        
        ArrayList<Integer> uniqueElements = new ArrayList<Integer>();         //create arraylist for unique elements
        
        for(int i = 0;i<elements.size()-1;i++){
            boolean addUnique = true;
            for(int j = 0;i<parentList.size()-1;j++){
                if(elements.get(i) == parentList.get(j)){
                    addUnique = false;
                    break;
                }
            }

            if(addUnique == true){
                uniqueElements.add(elements.get(i));
            }
        }

        for(int k = 0;k<uniqueElements.size()-1;k++){
            boolean addParent = false;
            for(int l = 0; l<parentList.size()-1;l++){
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

        return;
    }
}