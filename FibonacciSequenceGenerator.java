import java.util.Scanner;

public class FibonacciSequence {

    // Function to validate user input as a positive integer
    public static int getValidInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a positive integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a positive integer.");
                scanner.next();
            }
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Invalid input! Please enter a positive integer.");
            }
        } while (number <= 0);
        return number;
    }

    // Function to generate and print Fibonacci sequence up to n
    public static void generateFibonacciSequence(int n) {
        int firstNum = 0;
        int secondNum = 1;
        int nextNum;

        System.out.println("Fibonacci sequence up to " + n + ":");
        System.out.print(firstNum + " " + secondNum + " ");

        for (int i = 2; i < n; i++) {
            nextNum = firstNum + secondNum;
            System.out.print(nextNum + " ");
            firstNum = secondNum;
            secondNum = nextNum;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int userInput = getValidInput();
        generateFibonacciSequence(userInput);
    }
}
