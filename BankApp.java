package simpleBankingSystem;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double balance = 0.0;
		boolean running = true;
		
		while (running) {
			
			System.out.println("\n==== BANK MENU ====");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			
			System.out.print("Choose an option: ");
			int choice = input.nextInt();
			
			if (choice == 1) {
				
				System.out.println("Your balance is: $" + balance);
				
			} else if (choice == 2) {
				
				System.out.print("Enter deposit amount: ");
				double deposit = input.nextDouble();
				
				balance += deposit;
				
				System.out.println("Deposited $" + deposit);
				
			} else if (choice == 3) {
				
				System.out.print("Enter withdraw amount: ");
				double withdraw = input.nextDouble();
				
				if (withdraw <= balance) {
					balance -= withdraw;
					System.out.println("Withdrew $" + withdraw);
				} else {
					System.out.println("Insufficient funds.");
				}
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
