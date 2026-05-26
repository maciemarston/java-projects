package groceryListManager;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListManager {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> groceries = new ArrayList<>();
		
		boolean running = true;
		
		while (running) {
			
			System.out.println("\n==== Grocery List Menu ====");
			System.out.println("1. Add Grocery Item");
			System.out.println("2. View Grocery List");
			System.out.println("3. Remove Grocery Item");
			System.out.println("4. Exit");
			
			System.out.println("Choose an option: ");
			
			int choice = input.nextInt();
			input.nextLine();
			
			if (choice == 1) {
				
				System.out.print("Enter grocery item: ");
				String grocery = input.nextLine();
				
				groceries.add(grocery);
				
				System.out.println("Grocery item added!");
				
			} else if (choice == 2) {
				
				System.out.println("\nGrocery List:");
				
				for (int i = 0; i < groceries.size(); i++) {
					System.out.println((i + 1) + ". " + groceries.get(i));
				}
				
			} else if (choice == 3) {
				
				System.out.print("Enter grocery number to remove: ");
				int removeIndex = input.nextInt();
				
				groceries.remove(removeIndex - 1);
				
				System.out.println("Grocery item removed!");
				
			} else if (choice == 4) {
				
				running = false;
				System.out.println("Goodbye!");
				
			} else {
				
				System.out.println("Invalid option.");
				
			}
		}
		
		input.close();
	}
}