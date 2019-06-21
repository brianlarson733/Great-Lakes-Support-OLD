/**
 * Problem 5 - Project Euler - Chicago Pod Project
 * This is the class to take the elements returned by each number in your 
 */
import java.util.Scanner;
import java.util.ArrayList;

class Problem1 {
    public static void main(String[] args) {
    	System.out.println("Find the sum of all the multiples of A or B below X"); // Display the problem prompt
    	System.out.print("What is X? "); // Ask for X to define problem

//Ask the user to input upper bound of problem, and store, as well as other variables
		Scanner user_input = new Scanner( System.in); // Create a scanner object called user_input. Can reuse for each input
    	int total;									  // Create a int variable to store input
    	total = user_input.nextInt();				  // Stores next input

		System.out.print("What is A? "); // Ask for A to define problem
		int A;
		A = user_input.nextInt();

		System.out.print("What is B? "); // Ask for B to define problem
		int B;
		B = user_input.nextInt();		
//Create an array of all numbers below the upper bound
    	int numbers[] = new int[total]; //Initialize an array called numbers that has total elements (0 to total-1)
    	for (int i=0;i<total;++i){		//for loop filling array with all numbers from 0-99
    		numbers[i]=i;
    	}

//Pick all numbers divisible by 3 or by 5
    	ArrayList<Integer> selective = new ArrayList<Integer>();
   		
    	for (int j=0;j<total;++j){    		
    		if(numbers[j] % A == 0 || numbers[j] % B ==0){
    			selective.add(numbers[j]);
    			}
    	}

//Sum all the numbers in your picked out list
    	int sum = 0;
    	for(int k = 0;k<selective.size();++k){
    		sum = sum + selective.get(k); 
    	}


    	System.out.println(sum);

//    	for (int element = 0;element<selectivecount;++element){
  //  		System.out.print(selective[element]+" ");
   // 	}
       
    }
}