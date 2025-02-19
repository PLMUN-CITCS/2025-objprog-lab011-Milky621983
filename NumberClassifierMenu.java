import java.util.Scanner;

public class NumberClassifierMenu {
    public static void main(String[] args) {
        
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        char userChoice;  // Variable to store the user's choice
        
        // Start the do-while loop to display the menu repeatedly
        do {
            // Display menu options
            System.out.println("\n=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            // Read the user's menu choice
            int choice = input.nextInt();
            
            // Switch statement to handle the menu options
            switch (choice) {
                case 1: 
                    // Code for option 1: Classify the number
                    System.out.print("Enter a number to classify: ");
                    int number = input.nextInt();
                    
                    if (number > 0) {
                        System.out.println("The number " + number + " is positive.");
                    } else if (number < 0) {
                        System.out.println("The number " + number + " is negative.");
                    } else {
                        System.out.println("The number is zero.");
                    }
                    
                    // Check if the number is even or odd
                    if (number % 2 == 0) {
                        System.out.println("It is also an even number.");
                    } else {
                        System.out.println("It is an odd number.");
                    }
                    break;
                
                case 2:
                    // Code for option 2: Multiplication table
                    System.out.print("Enter a number to display its multiplication table: ");
                    int tableNumber = input.nextInt();
                    System.out.println("Multiplication Table for " + tableNumber + ":");
                    
                    // Generate multiplication table using a for loop
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
                    }
                    break;
                
                case 3:
                    // Code for option 3: Exit
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                
                default:
                    // Handle invalid option
                    System.out.println("Invalid option. Please choose between 1 and 3.");
            }
            
            // Ask the user if they want to return to the menu
            System.out.print("Do you want to return to the menu? (Y/N): ");
            input.nextLine();  // Consume newline
            userChoice = input.nextLine().toUpperCase().charAt(0);  // Read and convert to uppercase
        
        } while (userChoice == 'Y');  // Continue if the user chooses 'Y'
        
        // Close the scanner object outside the loop
        input.close();
    }
}
