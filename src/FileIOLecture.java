import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {

    public static void main(String[] args) {

        // ============================ PATH

//        Path pathToTest = Paths.get("src", "fileIoLecture", "test.txt");
//        System.out.println(pathToTest);
//        System.out.println("-----------------------");
//        Path pathToLuna = Paths.get("hello", "weywot.txt");
//        System.out.println(pathToLuna);
//        System.out.println("-----------------------");
//        Path fileLecturePath = Paths.get("src", "FileIOLecture.java");
//        System.out.println(fileLecturePath);
//        System.out.println(fileLecturePath.toAbsolutePath());
//        System.out.println("-----------------------");
//        Path otherPath = Paths.get("src", "../", "src", "../", "src", "fileIoLecture", "FileIOLecture");
//        System.out.println(otherPath);
//        System.out.println(otherPath.normalize());
//        System.out.println(otherPath.toAbsolutePath());
//        System.out.println(otherPath.normalize().toAbsolutePath());

        // ============================ FILE METHODS

//        System.out.println(Files.exists(fileLecturePath));
//        System.out.println(Files.exists(Paths.get("bob.txt")));
//
//        String directory = "data";
//        String filename = "info.txt";
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        System.out.println(dataDirectory);
//        System.out.println(dataFile);
//
//        if (Files.notExists(dataDirectory)) {
//            try {
//                Files.createDirectories(dataDirectory);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        if (Files.notExists(dataFile)) {
//            try {
//                Files.createFile(dataFile);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


        // ============================ READING FILES

//        Path p = Paths.get("src", "test.txt");
//
//        List<String> lines = new ArrayList<>();
//
//        try {
//            // readAllLines transforms each line in a file in to a string
//            // each element of the returned list is a string
//            lines = Files.readAllLines(p);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(lines);
//
//        for (String name : lines) {
//            System.out.println("Hello, " + name + "!");
//        }
//
//
//
//        try {
//            List<String> contents = Files.readAllLines(
//                Paths.get("src", "bob.txt")
//            );
//            for (String line : contents) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            System.out.println("Exception!");
//            e.printStackTrace();
//        }
//


        // ============================ WRITING FILES
//        try {
//            File myObj = new File("test.txt");
//            if (myObj.createNewFile()) {
//                System.out.println("File created: " + myObj.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//
//        Path p = Paths.get("src","test.txt");
//
//        List<String> newNames = Arrays.asList("John", "Fred", "Cathy");
//        try {
//            // write takes two arguments. the path to the file and a list to add to the file
//            Files.write(p, newNames);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        List<String> names = new ArrayList<>();
//        names.add("Tim");
//        names.add("Sally");
//        names.add("Mary");
//
//        try {
//            // write to the file without overwriting the existing content of the file
//            Files.write(p, names, StandardOpenOption.APPEND);
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
    }
}





