import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userQuestion = "";
        System.out.println("Ask Bob a question");
        while (userQuestion.equals("")) {
            userQuestion = scan.nextLine();
            if (userQuestion.endsWith("?")) {
                System.out.println("Sure");
            } else if (userQuestion.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userQuestion.equals("")) {
                System.out.println("Fine. Be that way!");
            }else {
                System.out.println("Whatever");
            }
        }
    }
}
