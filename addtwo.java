import java.util.Scanner;

class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        int num3 = scanner.nextInt();

        // Prompt user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the sum of two numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
