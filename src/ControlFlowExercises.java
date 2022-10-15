import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // a. while loop
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
        // this line of code is added to separate each problem output
        System.out.println("/**********************/");
        // b. do while
        int j = 0;
        do {
            System.out.println(j);
            j += 2;
        } while(j <= 100);

        // this line of code is added to separate each problem output
        System.out.println("**********************");
        int k = 100;
        do {
            System.out.println(k);
            k -= 5;
        } while(k > 5);

        // this line of code is added to separate each problem output
        System.out.println("**********************");
        long q = 2L;
        do {
            System.out.println(q);
            q *= q;
        } while(q < 1000000);

        // this line of code is added to separate each problem output
        System.out.println("**********************");
          //refactor the last two do while loops
        for(int ii = 5; ii <= 15; ii++) {
            System.out.println(ii);
        }
        // this line of code is added to separate each problem output
        System.out.println("**********************");
        for(int jj = 0; jj <= 100; jj+= 2) {
            System.out.println(jj);
        }
        // this line of code is added to separate each problem output
        System.out.println("**********************");
        for (int kk = 100; kk > 5; kk -= 5) {
            System.out.println(kk);
        }
        // this line of code is added to separate each problem output
        System.out.println("**********************");
        for(long qq = 2; qq < 1000000; qq *= qq) {
            System.out.println(qq);
        }

        // this line of code is added to separate each problem output
        System.out.println("**********************");
         // 2. Fizzbuzz
        for (int d = 1; d <= 100; d++) {
            if (d % 3 == 0 && d % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (d % 3 == 0) {
                System.out.println("Fizz");
            } else if (d % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(d);
            }
        }

        // this line of code is added to separate each problem output
        System.out.println("**********************");

        // 3. Display a table of powers
        Scanner scan = new Scanner(System.in);
        String userResponse = "y";
        while(userResponse.equals("y")) {
            System.out.println("Enter an integer:");
            int number = scan.nextInt();
            System.out.println("Number | Squared | Cubed");
            System.out.println("------ | ------- | -----");

            for (int n = 1; n <= number; n++) {
                int squared = (int) (Math.pow(n, 2));
                int cubed = (int) (Math.pow(n, 3));
                System.out.printf("%-7d| %-8d| %-5d%n", n, squared, cubed);
            }
            System.out.println("Do you want to continue?(y/n)");
            userResponse = scan.next();
        }

        // this line of code is added to separate each problem output
        System.out.println("**********************");
        // 4. Convert given number grades into letter grades.
        String userInput = "y";
        while (userInput.equals("y")) {
            System.out.println("Enter your Grade:");
            int grade = scan.nextInt();
            if (grade > 88 && grade <= 100) {
                System.out.println("Excellent: Grade A");
            } else if(grade > 80 && grade <= 87) {
                System.out.println("Very Good: Grade B");
            } else if(grade > 67 && grade <= 79) {
                System.out.println("Good: Grade C");
            } else if(grade > 60 && grade <= 66) {
                System.out.println("Satisfactory: Grade D");
            } else {
                System.out.println("Failed!: Grade F");
            }
            System.out.println("Do you want to continue?(y/n)");
            userInput = scan.next();
        }


    }
}
