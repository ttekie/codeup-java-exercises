import java.util.Scanner;
public class ConsoleIOLecture {
    public static void main(String[] args) {
        String cohort = "Weywot";
        String timeOfDay = "morning";
        byte week = 10;
        float someNumber = 123.456F;
//        System.out.printf("Good, %s %s!%n", timeOfDay, cohort);
//        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
//        System.out.printf("Hello, %s", cohort);
//        System.out.println("Will this be on a separate line?");
//        System.out.println("How about this?");
//        System.out.printf("The number is %11f%n", someNumber);
//        System.out.printf("This number is %d%n", someNumber);
//
        // instantiate a scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String userInput = scanner.next();
        System.out.printf("Your word was %s.%n", userInput);
        System.out.println("Enter a number:");
//        int userNumber = Integer.parseInt(scanner.nextLine());
;        int userNumber = scanner.nextInt();
        System.out.printf("Your number was: %d%n", userNumber);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
    }

}
