import java.util.*;

public class Test{

	public static void main(String[] args){

		//make a switch statement to test the different classes

		boolean running = true;
				
		while(running){
			System.out.println("Which method's do you want to test?");
			System.out.println("1 - Justin's store method");
			System.out.println("2 - Nate's factorize method");
			System.out.println("3 - Isaac's prime test method");
			System.out.println("4 - I'm done, let me out of here!");
			int[] tempArray = {1, 2, 3, 4};
			int choice = Tools.getWholeNumberInput(tempArray);

			switch (choice){
				case 1:
					System.out.println("How long do you want listA to" +
						" be? We will see if any factors in this list need" + 
						" to be added into listB.");
					int length = Tools.getWholeNumberInput();
					System.out.println("Ok, listA will be of length " + length);
					ArrayList<Integer> listA = new ArrayList<Integer>();
					for (int i=0; i < length; i++){
						listA.add(Tools.getWholeNumberInput());
					}

					System.out.println("How long do you want listB to" +
						" be? We will see if we need to add any numbers" + 
						" to this list.");
					length = Tools.getWholeNumberInput();
					System.out.println("Ok, listB will be of length " + length);
					ArrayList<Integer> listB = new ArrayList<Integer>();
					for (int i=0; i < length; i++){
						listB.add(Tools.getWholeNumberInput());
					}
					AddToArrayList.store(listA,listB);
					System.out.println("Contents of listB: " + listB);
					break;
			
				case 2:
					break;

				case 3:
					break;
				
				case 4:
					running = false;
				default:
					break;
			}	
		}

	}


}