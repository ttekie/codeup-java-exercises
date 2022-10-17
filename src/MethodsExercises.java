import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(4, 8));
        System.out.println(subtraction(8, 3));
        System.out.println(multiplication(2, 5));
        System.out.println(division(3, 9));
        System.out.println(reminder(4, 14));

        int userInput = getInteger(1, 20);
        System.out.println("The number you entered is: " + userInput);

        factorial(1, 10);
    }
    // 1. Basic Arithmetic
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public static int division(int num1, int num2) {
        return num2 / num1;
    }
    public static int reminder(int num1, int num2) {
        return num2 % num1;
    }
    // 2. Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.
    public static int getInteger(int min, int max) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 20:");
            int userInput = scan.nextInt();
            if (userInput > min && userInput < max) {
                return userInput;
            }
        }
    }

    public static void factorial(int min, int max) {
        Scanner reader = new Scanner(System.in);
        String choice = "y";
        long factorial = 1;
        while (choice.equals("y")) {
            System.out.println("Enter an integer between " + min + " and " + max);
            int userInput = reader.nextInt();
            if (userInput >= min && userInput < max) {
                for (int i = 1; i <= userInput; i++) {
                    factorial *= i;
                }
            } else {
                continue;
            }
            System.out.println(factorial);
            System.out.println("Do you want to continue? [y/n]");
            choice = reader.next();
        }
    }


}
