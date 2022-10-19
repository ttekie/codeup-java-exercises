package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner;

    // constructor method
    public Input() {
        scanner = new Scanner(System.in);
    }
    // getter method
    public Scanner getScanner() {
        return scanner;
    }
    // setter method
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    // instance method
    public String getString() {
        System.out.println("Enter your input:");
        return scanner.nextLine();
    }
    // instance method
    public boolean yesNo() {
        System.out.println("Enter yes or no");
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }
    // instance method
    public int getInt(int min, int max) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.printf("Enter a number between %d and %d:%n", min, max);
            int userInput = scan.nextInt();
            if (userInput >= min && userInput <= max) {
                return userInput;
            }
        }
    }
    // instance method
    public int getInt() {
        System.out.println("Enter an Integer");
        return scanner.nextInt();
    }
    // instance method
    public double getDouble(double min, double max) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.printf("Enter a number between %f and %f:%n", min, max);
            double userInput = scan.nextDouble();
            if (userInput >= min && userInput <= max) {
                return userInput;
            }
        }
    }
    // instance method
    public double getDouble() {
        System.out.println("Enter a decimal number:");
        return scanner.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}
