package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        // instantiate Student class
        Student james = new Student("James");
        james.addGrade(78);
        james.addGrade(80);
        james.addGrade(90);
        james.addGrade(69);
        System.out.println(james.getGrades());
        System.out.printf("Average grade is: %.2f", james.getGradeAverage());
    }
}