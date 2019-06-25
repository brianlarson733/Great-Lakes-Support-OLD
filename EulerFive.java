/**
/ This class will call helper methods defined in separate classes to solve a
/ generalized form of Euler problem #5: https://projecteuler.net/problem=5
/ "2520 is the smallest number that can be divided by each of the numbers 
/ from 1 to 10 without any remainder. What is the smallest positive number
/ that is evenly divisible by all of the numbers from 1 to 20?"
*/

public class EulerFive{

	public static void main(String[] args){

		//This will contain all required divisors after prime factorizing input
		ArrayList<Integer> factorList = new ArrayList<Integer>();
		
		//Lower bound for the list of consecutive integers
		int lowerBound = 0;

		//Upper bound for the list of consecutive integers
		int upperBound = 0;

		//Display the problem prompt
		System.out.println("I can find the smallest positive number that is" +
			" evenly divisible by a list of consecutive factors. That is, I" + 
			" can calculate least common multiples for you. Please input a" +
			" lower bound and an upper bound for the list of consecutive" +
			" factors.");

		System.out.print("First, please enter a lower bound.");
		lowerBound = Tools.getWholeNumberInput();
		
		System.out.print("Now, please enter an upper bound.");
		upperBound = Tools.getWholeNumberInput();

		//For loop bounded by lower and upper user inputs, go from highest
		//to lowest looking for required factors.
		//Call NumberFactorizer on the current int, pass the answer ArrayList
		//The NumberFactorizer class uses IsPrime to test if the factor needs
		//to be broken down further. Once a prime factor is found, 
		//AddToPrimeFactor will pass factors to ArrayList if it is not already
		// contained in the list.

		//Multiply the factors of ArrayList and display the answer.

	}

}

