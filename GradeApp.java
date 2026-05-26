package gradeTracker;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Double> grades = new ArrayList<>();
		
		boolean running = true;
		
		while (running) {
			
			System.out.println("\n==== GRADE TRACKER ====");
			System.out.println("1. Add Grade");
			System.out.println("2. View Grades");
			System.out.println("3. Average Grade");
			System.out.println("4. Highest & Lowest Grade");
			System.out.println("5. Exit");
			
			System.out.print("Choose an option: ");
			int choice = input.nextInt();
			
			if (choice == 1) {
				
				System.out.print("Enter grade: ");
				double grade = input.nextDouble();
				
				grades.add(grade);
				
				System.out.println("Grade added!");
				
			} else if (choice == 2) {
				
				System.out.println("\nGrades:");
				
				for (int i = 0; i < grades.size(); i++) {
					System.out.println((i + 1) + ". " + grades.get(i));
				}
			
			} else if (choice == 3) {
				
				double sum = 0;
				
				for (double g : grades) {
					sum += g;
				}
				
				double average = sum / grades.size();
				
				System.out.println("Average grade: " + average);
			} else if (choice == 4) {
				
				double max = grades.get(0);
				double min = grades.get(0);
				
				for (double g : grades) {
					if (g > max) max = g;
					if (g < min) min = g;
				}
				
				System.out.println("Highest grade: " + max);
				System.out.println("Lowest grade: " + min);
			
			} else if (choice == 5) {
				
				running = false;
				System.out.println("Goodbye!");
				
			} else {
				System.out.println("Invalid option.");
			}
		}
		
		input.close();

	}

}
