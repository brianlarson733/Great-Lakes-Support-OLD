package misc;

import java.util.*;

public class Tools {
	
	public static int getWholeNumberInput() {
        Scanner scanner = new Scanner(System.in);
        String placeholder = "";
        int toReturn = -1;

        while ((toReturn < 1) | (toReturn != (int) toReturn)){
            System.out.println("Please enter a positive whole number.");
            placeholder = scanner.nextLine();
            try {
                toReturn = Integer.parseInt(placeholder);
            }
            catch (NumberFormatException e) {}
        }
        return toReturn;
    }

    /*
     * It is assumed that choices is filled with whole numbers
     */
    public static int getWholeNumberInput(int[] choices) {

        Scanner scanner = new Scanner(System.in);
        String placeholder = "";
        int toReturn = -1;

        while ((toReturn < 1) | (toReturn != (int) toReturn)){

            System.out.println("Please enter a number from the following"
                    + " choices: ");

            //print out the available choices from the int array
            int i = 0;
            for (; i < choices.length-1 ; i++){
                System.out.print(choices[i] + ", ");
            }
            System.out.println(choices[i] + "");

            //get user the user input and verify it is an int
            placeholder = scanner.nextLine();
            try {
                toReturn = Integer.parseInt(placeholder);
            }
            catch (NumberFormatException e) {}

            //check if user input is in choices, if not reject it
            if (Arrays.binarySearch(choices, toReturn) < 0){
                toReturn = -1;
                System.out.println();
                System.out.println("Please select a valid choice");
                System.out.println();
            }
        }
        return toReturn;
    }
    
    /*
     * It is assumed that choices is filled with Strings
     */
    public static int getWholeNumberInput(String[] choices) {

        Scanner scanner = new Scanner(System.in);
        
        //the original string the user enters
        String userInput = "";
        
        //will be the input string converted to an int
        int userInputInt = -1;

        //user input must be an integer greater than or equal to 1
        while ((userInputInt < 1) | (userInputInt != (int) userInputInt)){

            System.out.println("Please enter a number from the following"
                    + " choices: ");

            //print out the available choices from the String array
            
            for (int i=0; i < choices.length ; i++){
                System.out.println((i+1) + ": " + choices[i]);
            }
            
            //get user the user input and verify it is an int
            userInput = scanner.nextLine();
            try {
            	userInputInt = Integer.parseInt(userInput);
            }
            catch (NumberFormatException e) {}

            //check if user input is in choices, if not reject it
            if (userInputInt < 1 || userInputInt > choices.length){
            	userInputInt = -1;
                System.out.println();
                System.out.println("Please select a valid choice");
                System.out.println();
            }
        }
        return userInputInt;
    }
    
    /*
     * It is assumed that choices is filled with Strings
     */
    public static int getWholeNumberInput(ArrayList<String> choices) {

        Scanner scanner = new Scanner(System.in);
        
        //the original string the user enters
        String userInput = "";
        
        //will be the input string converted to an int
        int userInputInt = -1;

        //user input must be an integer greater than or equal to 1
        while ((userInputInt < 1) | (userInputInt != (int) userInputInt)){

            System.out.println("Please enter a number from the following"
                    + " choices: ");

            //print out the available choices from the ArrayList
            
            for (int i=0; i < choices.size() ; i++){
                System.out.println((i+1) + ": " + choices.get(i));
            }
            
            //get user the user input and verify it is an int
            userInput = scanner.nextLine();
            try {
            	userInputInt = Integer.parseInt(userInput);
            }
            catch (NumberFormatException e) {}

            //check if user input is in choices, if not reject it
            if ((userInputInt < 1) | (userInputInt > choices.size())){
            	userInputInt = -1;
                System.out.println();
                System.out.println("Please select a valid choice");
                System.out.println();
            }
        }
        return userInputInt;
    }
}