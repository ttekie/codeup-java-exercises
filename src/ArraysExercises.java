import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        // when I print out the reference of the array it output the memory address
        // of the array instead of the array
//        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        // instantiate the Person class
        Person person1 = new Person("Tom");
        Person person2 = new Person("Frank");
        Person person3 = new Person("Bob");
        Person person4 = new Person("Marry");

        Person[] persons = {person1, person2, person3};
        for (Person person : persons) {
            System.out.println(person.getName());
        }
        System.out.println(Arrays.toString(addPerson(persons, person4)));
    }
    public static Person[] addPerson(Person[] person, Person personOne) {
        // add one object to the end of the array and return that array
        person = Arrays.copyOf(person, person.length + 1);
        System.out.println(Arrays.toString(person));
        person[person.length - 1] = personOne;
        return person;
    }
}
