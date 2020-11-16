/**
/ This class will call helper methods defined in separate classes to solve a
/ generalized form of Euler problem #5: https://projecteuler.net/problem=5
/ "2520 is the smallest number that can be divided by each of the numbers 
/ from 1 to 10 without any remainder. What is the smallest positive number
/ that is evenly divisible by all of the numbers from 1 to 20?"
*/

import java.util.*;

public class EulerFive{

	public static void main(String[] args){

		//Calculating the product of all numbers in this list will give the LCM
		ArrayList<Integer> requiredDivisorsList = new ArrayList<Integer>();

		long answer = 0;
		
		//Lower bound for the list of consecutive integers
		int lowerBound = 0;

		//Upper bound for the list of consecutive integers
		int upperBound = 0;

		//Display the problem prompt
		System.out.println("\nI can find the smallest positive number that is" +
			" evenly divisible by a list of consecutive factors. That is, I" + 
			" can calculate least common multiples for you given a lower" +
			" bound and an upper bound for the list of consecutive factors.\n");

		System.out.print("First, enter a lower bound. ");
		lowerBound = Tools.getWholeNumberInput();
		
		System.out.print("\nNow, enter an upper bound. ");
		while(upperBound < lowerBound){
			System.out.print("Make sure the upper bound is greater than or" +
				" equal to the lower bound of " + lowerBound + ". ");
			upperBound = Tools.getWholeNumberInput();
		}

		//the goal of this for loop is to gather the list of divisors 
		//that should divide into the least common multiple.  
		for(int i = upperBound; i >= lowerBound; i--){
			ArrayList<Integer> factorList = NumberFactorizer.factorize(i);
			AddToArrayList.store(factorList, requiredDivisorsList);	
		}

		//find the product of the required divisors
		while(requiredDivisorsList.isEmpty() == false){
			answer = answer * requiredDivisorsList.get(0);
			requiredDivisorsList.remove(0);
		}

		//display the answer
		System.out.println("The answer is " + answer + ". Have a nice day.");
	}
}