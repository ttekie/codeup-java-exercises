import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        int min = 1;
        int max = 100;
        Random randomNum = new Random();
        int randomNumber = min + randomNum.nextInt(max);
        System.out.println(randomNumber);
        while (true) {
            System.out.printf("enter a number between %d and %d:%n", min, max );
            int userInput = new Scanner(System.in).nextInt();

            if (userInput < randomNumber){
                System.out.println("LOWER");
            } else if (userInput > randomNumber){
                System.out.println("HIGHER");
            } else if (userInput == randomNumber){
                System.out.println("GOOD GUESS!");
                break; // <---- Add this, this will make the loop stop when the
                // player gets the answer correct and therefore the program will end
            }
            else {
                System.out.println("not a valid option");
            }
        }
    }
}
