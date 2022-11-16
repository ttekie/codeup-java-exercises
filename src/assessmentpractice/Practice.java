package assessmentpractice;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        System.out.println(Practice.subtractTen(25));

        int[] arrayOfNumbers = {20, 25, 40, 5};
        System.out.println(Practice.average(arrayOfNumbers));

        ArrayList<Integer> numbers = new ArrayList<>(List.of(8, 5, 3, 9));
        System.out.println(multiplyAll(2, numbers));
    }
    public static int subtractTen(int number) {
        return number - 10;
    }
    public static double average(int[] numbers) {
        int accumulator = 0;
        for (int number : numbers) {
            accumulator += number;
        }
        System.out.println(accumulator);
        return (double) accumulator / numbers.length;
    }
    public static ArrayList<Integer> multiplyAll(int num, ArrayList<Integer> numbers) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for(Integer number : numbers) {
            newArrayList.add(number * num);
        }
        return newArrayList;
    }
}
class Pet {
    private String name;
    private String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
class PetDog extends Pet implements Companion {
    private boolean trained;
    // the constructor inherited from supper class and
    // set the trained property of PetDog class
    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }
    // instance method that return a boolean value
    public boolean isTrained() {
        return trained;
    }
    // instance method that returns a String value
    public String snuggle() {
        return getName() + " wants to snuggle";
    }
    public static void allSnuggle(ArrayList<PetDog> petDogs) {
        for(PetDog petDog : petDogs) {
            System.out.println(petDog.snuggle());
        }
    }
}
interface Companion  {
    public String snuggle();
}
class PetDogTest {
    public static void main(String[] args) {
        PetDog dog = new PetDog("Milo", "bulldog", true);
        System.out.println(dog.snuggle());

        ArrayList<PetDog> dogs = new ArrayList<>(List.of(new PetDog("cooper", "Bulldog", true), new PetDog("Charlie", "Siberian Husky", false),new PetDog("Luna", "Poodle", true)));
        PetDog.allSnuggle(dogs);
    }
}
// 1. Create a class called Practice with a main method.
// 2. Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
// 3. Create a public static method *average* in the Practice class that takes an array of integers and returns their average as a double.
// 4. Create a class called Pet with two String instance variables, name and type.
// 5. Create getters and setters for the properties as well as a constructor that takes two strings and sets the name and type.
// 6. Create a PetDog class that inherits from Pet.
// 7. In PetDog, create a boolean instance variable, trained.
// 8. Write a constructor for PetDog that sets its name, type, and trained properties.
// 9. Write an instance method in PetDog called isTrained that returns the boolean value of the trained property.
// 10. Create an interface named Companion. The Companion interface should specify an instance method named snuggle that has no arguments and returns a String. Change your PetDog class so it implements the Companion interface. The implementation of the snuggle method on the PetDog class should return "name wants to snuggle", where name is the inherited instance property.
// 11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.
//12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument.

//continue from here --> //12b. In your PetDog class, create a static method named allSnuggle. It should accept an ArrayList of PetDog objects and output the result of calling the snuggle method on all of them. Create an ArrayList with at least three PetDog instances in the PetDogTest class. Call the allSnuggle method and pass it the ArrayList. Verify that the allSnuggle method works correctly.

