import java.util.Scanner;

public class StrongNumberChecker {
    
    // Function to calculate factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sumOfFactorials = 0;

        // Calculate the sum of the factorials of the digits
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sumOfFactorials += factorial(digit); // Add factorial of the digit
            number /= 10; // Remove the last digit
        }

        // Check if the sum of factorials is equal to the original number
        if (sumOfFactorials == originalNumber) {
            System.out.println(originalNumber + " is a Strong number.");
        } else {
            System.out.println(originalNumber + " is not a Strong number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
