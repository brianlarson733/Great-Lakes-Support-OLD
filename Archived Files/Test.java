import java.util.*;

public class Test{

	public static void main(String[] args){

		boolean running = true;
				
			System.out.println("Which method do you want to test?");
			System.out.println("1 - Justin's store method");
			System.out.println("2 - Nate's factorize method");
			System.out.println("3 - Isaac's prime test method");
			System.out.println("4 - I'm done, let me out of here!");
			int[] tempArray = {1, 2, 3, 4};
			int choice = Tools.getWholeNumberInput(tempArray);

			switch (choice){
				case 1:
					while(running){
						System.out.println("\nHow long do you want listA to" +
							" be? We will see if any factors in this list need" + 
							" to be added into listB.");
						int length = Tools.getWholeNumberInput();
						System.out.println("\nOk, listA will be of length " + length +
							". Now enter the contents of listA.");
						ArrayList<Integer> listA = new ArrayList<Integer>();
						for (int i=0; i < length; i++){
							listA.add(Tools.getWholeNumberInput());
						}

						System.out.println("\nHow long do you want listB to" +
							" be? We will see if we need to add any numbers" + 
							" to this list.");
						length = Tools.getWholeNumberInput();
						System.out.println("\nOk, listB will be of length " + length +
							". Now enter the contents of listB.");
						ArrayList<Integer> listB = new ArrayList<Integer>();
						for (int i=0; i < length; i++){
							listB.add(Tools.getWholeNumberInput());
						}
						AddToArrayList.store(listA,listB);
						System.out.println("\nContents of listB: " + listB);
						System.out.println("\nLet's repeat the test now. You " +
							"can press ctrl+c to exit.");
					}
					break;
			
				case 2:
					while(running){
						System.out.println("What number do you want to factorize?");
						int toFactor = Tools.getWholeNumberInput();
						
						//Uncoment this line once factorize() is written
						//System.out.println("The output is " + NumberFactorizer.factorize(toFactor));
					}
					break;

				case 3:
					while(running){
						/**
						
						System.out.println("What number do you want to test for primality?");
						int toTest = Tools.getWholeNumberInput();
						System.out.println("Is " + toTest + " prime? Answer: " + PrimeTest.isPrime(toTest));
						*/
					}
					break;
				
				case 4:
					running = false;
				default:
					break;
		}	
	}
}