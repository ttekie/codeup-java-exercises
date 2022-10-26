package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        // hashmap gets a key value pair for a student username and
        // student object that contains name and grades
        HashMap<String, Student> students = new HashMap<>();

        // first student object created from student class
        Student James = new Student("James");
        James.addGrade(90);
        James.addGrade(80);
        James.addGrade(89);
        students.put("jfrank", James);

        // second student object created from student class
        Student robert = new Student("Robert");
        robert.addGrade(90);
        robert.addGrade(87);
        robert.addGrade(78);
        students.put("rwilliam", robert);

        // third student object created from student class
        Student richard = new Student("Richard");
        richard.addGrade(78);
        richard.addGrade(90);
        richard.addGrade(69);
        students.put("richyb", richard);

        // fourth student object created from student class
        Student manny = new Student("Manny");
        manny.addGrade(80);
        manny.addGrade(94);
        manny.addGrade(57);
        students.put("mman", manny);

//        System.out.printf("Jame's avarage grade is: %.2f%n", students.get("jfrank").getGradeAverage());
//        System.out.printf("Robert's avarage grade is: %.2f%n", students.get("rwilliam").getGradeAverage());
//        System.out.printf("Richard's avarage grade is: %.2f%n", students.get("richyb").getGradeAverage());
//        System.out.printf("Manny's avarage grade is: %.2f", students.get("mman").getGradeAverage())

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        students.forEach((key, Student) -> {
            System.out.printf("| " + key + " | ");
        });
        System.out.println();
        String userChoice = "y";

        // while will loop until the user input is yes if not
        // it will stop iterating
        while (userChoice.equals("y")) {
            Scanner reader = new Scanner(System.in);
            System.out.println("What student would you like to see more information on?");
            String userInput = reader.nextLine();

            // using if...else control statement, we check if userInput matches and if it does
            // it will output the student name, username and average and if does not it will
            // output the mismatched username
            if (students.containsKey(userInput)){
                System.out.printf("Name: %s - Github username: %s%n", students.get(userInput).getName(), userInput);
                System.out.printf("Current Average: %.2f%n", students.get(userInput).getGradeAverage());
            } else {
                System.out.printf("Sorry, no student found with the GitHub username: %s%n", userInput);
            }
            System.out.println("Would you like to see another student?");
            userChoice = reader.nextLine();
            if (userChoice.equals("n")) {
                System.out.println("Goodbye, and have a wonderful day!");
            }
        }

    }
}