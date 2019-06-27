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
}
