//================================= FILE IO MINI-EXERCISE
//
//  - create a class called `FileIoPractice` with a main method
//
//  - add a `fileIo` folder to the root of your codeup-java-exercises project.
//
//   - within this folder, add a text file, `people.txt`.
//
//   - add the following contents to the file:
//
//   Justin
//   Javier
//   Jason
//   Laura
//
//   - write code in the main method that prints the following messages:
//
//   "Justin works at Codeup."
//   "Javier works at Codeup."
//   "Jason works at Codeup."
//   "Laura works at Codeup."
//
//   - create an array list of first names of four other people in your cohort
//
//   - add code to your main method that replaces the contents of `people.txt` with your classmates by writing to the file
//
//   - BONUS: create a static method, `deleteEntry`, that takes in the name of someone (a string) and when invoked, rewrites a new list to the `people.txt` file
//   with all entries except the passed in name
//


import java.io.IOException;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class FileIOPractice {

    private final static Path PATH = Paths.get("fileIo", "people.txt");

    // Read people.txt
    private static List<String> readLines() {
        List<String> names;
        try {
            names = Files.readAllLines(PATH);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return names;
    }

    private static void greetNames() {
        for (String name : readLines()) {
            System.out.printf("%s works at Codeup.%n", name);
        }
    }

    private static void writeLines(List<String> lines) {
        try {
            Files.write(PATH, lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {

        // greet names
//        greetNames();
//        System.out.println("==================");

        // write to file and replace names...
//        List<String> newNames = Arrays.asList("Cody", "Nikki", "Jordy", "Jay");
//        writeLines(newNames);
//        greetNames();

        // delete name from list...
        deleteName("Jordy");
        greetNames();

    }


    // Bonus
    private static void deleteName(String nameToDelete) {
        List<String> updatedNames = new ArrayList<>();
        for (String name : readLines()) {
            if (!name.equalsIgnoreCase(nameToDelete)) {
                updatedNames.add(name);
            }
        }
        writeLines(updatedNames);
    }

}