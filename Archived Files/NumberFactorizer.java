
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
        Integer lowestprime = new Integer(2);
        Integer upperbound = toFactor;
        ArrayList<Integer> listC = new ArrayList<Integer>();

        // This For loop takes the
        for (int primedivider = 2; primedivider<=upperbound; primedivider++) {
             if (0 == primedivider % lowestprime) {

                        System.out.println("Printing lowest prime = " + primedivider);
                        listC.add(primedivider);
                        System.out.println("Printing upperbound / primedivier = " + (upperbound / primedivider));
                        listC.add(upperbound / primedivider);
                        }

                lowestprime++;
                System.out.println();

            // this } is for the outer For loop
            }

        return listC; }
}

