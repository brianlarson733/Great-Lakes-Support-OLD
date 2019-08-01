
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

        // This For loop takes the
        for (int divider = 2; divider<=upperbound; divider++) {
             if (0 == lowerbound % lowestprime) {

                    //This if determines if the lowerbound is less than the divider //
                    if (lowerbound < divider) {
                        //System.out.println("Lowerbound is less than divider, no data stored");
                        //System.out.println();
                        break;
                    }

                    //This else stores the lowest prime if lowerbound % lowestprime = 0 //
                    else {
                        System.out.println("Printing lowest prime = " + lowestprime);
                        listC.add(lowestprime);
                        System.out.println("Printing upperbound / lowestprime = " + (upperbound / lowestprime));
                        listC.add(upperbound / lowestprime);
                        lowerbound++;

                    }
                        }

                lowestprime++;
                System.out.println();

            // this } is for the outer For loop
            }

        return listC; }
}

