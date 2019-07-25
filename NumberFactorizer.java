
import java.util.Scanner;
import java.util.ArrayList;


/**
 / This class will call helper methods defined in separate classes to solve a
 / generalized form of Euler problem #5: https://projecteuler.net/problem=5


 @author = Nathan Roberts

 */

//this class will determine the factors within a provided integer
    //execute javac java.test then java Test to run the program

public class NumberFactorizer {

    public static ArrayList<Integer> factorize(int toFactor) {
        //set i = 2 (this needs to be an integer var)
        Integer lowestprime = new Integer(2);
        Integer lowerbound = new Integer (2);
        Integer upperbound = toFactor;
        ArrayList<Integer> listC = new ArrayList<Integer>();

        /**Testing code - remove this block prior to using code
        Integer lowerbound = new Integer (2);
        Integer upperbound = new Integer (10);
        */

    //public static int numberFactorizer (int lowstore int inputstore[]) {
        //isPrime ? - if so store to array
        /** This can be worked out later
            if (lowerbound = isPrime) {
                int inputstore = lowerbound;
            }

                else {
            */
        //take input and modulo (?%?) by i and check if equals (==) 0

        for (int divider = 2; divider<=upperbound; divider++) {

            for (int i = 2; i<=upperbound;i++) {
                if (0 == lowerbound % lowestprime) {
                    if (lowerbound < divider){
                        System.out.println ("Lowerbound is less than divider, no data stored");
                        System.out.println ();
                            }
                    else {
                        /** This code is to test that the modulo function works as expected
                        System.out.println("Lowerbound is " + lowerbound +
                                ", Module is " + (lowerbound % lowestprime)
                                    + ", Lowest Prime is " + lowestprime);
                         System.out.println();*/

                        listC.add(lowestprime);
                        lowerbound++;

                            }
                    } else {
                    /**
                     System.out.println("Lowerbound (" + lowerbound + ") is not divisible cleanly by " + lowestprime
                            + " has been stored to the array (implement this)"); */
                    lowerbound++;

                                }

                                 }
                lowestprime++;
                lowerbound = 2; //This needs to be relocated elsewhere, right now its breaking the output

                 /**
                    else if (lowestprime = isPrime) {
                    int lowstore = lowestprime;
                }
                //check if (input/i) is prime
                //if yes - store to array - exit class

                if ((input / lowestprime) = isPrime) {
                    int inputstore = (input / lowestprime)
                }

                //if no factorize again (recursion to the top of this class)

                     */

            }

        return listC; }
}

