import java.io.*;
import java.util.*;

class Timepass {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String command;

        System.out.println("Calculator in Java");

        while (true) {
            System.out.println("Enter 'exit' or 'off' to quit or press Enter to continue: ");
            command = s.nextLine();

            if (command.equalsIgnoreCase("exit") || command.equalsIgnoreCase("off")) {
                System.out.println("Calculator is turning off. Thank you!");
                break;
            }

            // Taking inputs for the numbers
            System.out.println("Enter the value of a: ");
            int a = s.nextInt();

            System.out.println("Enter the value of b: ");
            int b = s.nextInt();

            // Taking input for the operation
            System.out.println("Enter the operation (+, -, *, /, %): ");
            char o = s.next().charAt(0);  // Store operator as a char

            int result = 0;  // Declare result variable to store the result of the operation
            boolean validOperation = true;  // Flag to check for valid operation

            switch (o) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                case '%':
                    if (b != 0) {
                        result = a % b;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
                    validOperation = false;
            }

            // Only print the result if the operation was valid
            if (validOperation) {
                System.out.println("The result of " + a + " " + o + " " + b + " is: " + result);
            }

            // To clear any leftover newline characters in the input buffer
            s.nextLine();
        }
    }
}
