import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userNumber = scanner.nextInt();
        System.out.printf("The number you entered is %d%n ", userNumber);
        // when I entered a string instead of an integer it gives me error message that
        //says InputMismatchException

        System.out.println("Enter three words:");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("%s%n%s%n%s%n", firstWord, secondWord, thirdWord);

        System.out.println("Enter a sentence:");
        String firstSentence = scanner.nextLine();
        System.out.printf("The first sentence is, %s%n", firstSentence);
        System.out.println("Enter another sentence:");
        String secondSentence = scanner.nextLine();
        System.out.printf("The second sentence is, %s%n", secondSentence);
        System.out.println("Enter another sentence again:");
        String thirdSentence = scanner.nextLine();
        System.out.printf("The third sentence is, %s%n", thirdSentence);

        // the nextLine() method captures a single word user input and displayed it in the console.
        // It also prints out a full sentence in to the console

        System.out.println("Enter a sentence:");
        // next() method only displays the first word in the sentence not the whole sentence
        String userSentence = scanner.next();
        System.out.printf("The sentence you entered is, %s%n", userSentence);

        System.out.println("Enter a sentence:");
        // nextLine() method captures the whole sentence
        String userSentence2 = scanner.nextLine();
        System.out.printf("The sentence you entered is, %s%n", userSentence2);

        System.out.println("Enter the length of your classroom:");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the width of your classroom:");
        int width = Integer.parseInt(scanner.nextLine());

        int area = length * width;
        System.out.printf("The area of the classroom is %d%n", area);
        int perimeter = 2 * (length + width);
        System.out.printf("The perimeter of the classroom is %d%n", perimeter);

        // Bonuses
        System.out.println("Enter the length of your classroom:");
        double lengthOfClassRoom = scanner.nextDouble();
        System.out.println("Enter the width of your classroom:");
        double widthOfClassRoom = scanner.nextDouble();
        System.out.println("Enter height of the your classroom:");
        double heightOfClassRoom = scanner.nextDouble();

        double volume = lengthOfClassRoom * widthOfClassRoom * heightOfClassRoom;
        System.out.printf("The volume of the the classroom is, %.2f%n", volume);

//        1. Prompt the user to enter a favorite quote
        System.out.println("Enter your favorite quote");
//        - output the quote
        String favoriteQuote = scanner.nextLine();
        System.out.printf("Here is the quote you entered, %s!%n", favoriteQuote);
//        - ask them to enter how many words are in the quote
        System.out.println("How many words are in the quote?");
        int numberOfWords = scanner.nextInt();
//        - output the number they entered
        System.out.printf("The number of words on this quote is %d%n", numberOfWords);

//        - output if the number they entered indeed matched the number of words
//
//        2. Prompt the user to enter a list of top three favorite foods separated by only spaces
//
//        - Use the printf() to output the three top foods with the format:
//        1. FirstFood
//        2. SecondFood
//        3. ThirdFood
//
//        3. Prompt the user to enter a grocery list of three items
//                - each item should only be separated by a comma (no spaces)
//        - you will need to use the .useDelimiter() method on your scanner object
//                - output the result as a comma-separated list using printf()

    }
}
