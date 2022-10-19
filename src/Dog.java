public class Dog {
    // instance variables belong to the instance of the class
    // not to the class itself
    public  String name;
    public String sound;

    // instance method belong to the instance of the class
    // not to the class itself
    public void makeNoise() {
        String quote = Quote.RandomQuote();
        System.out.printf("%s goes %s%n", name, quote);
    }

    // constructor methods
    // A constructor in Java is a special method that is used to initialize objects
    // The constructor is called when an object of a class is created
    // In Java, a constructor is a block of codes similar to the method.
    // It is called when an instance of the class is created
    // At the time of calling the constructor, memory for the object is allocated in the memory
    // Note: It is not necessary to write a constructor for a class.
    // It is because java compiler creates a default constructor if your class doesn’t have any.
    // Constructors do not return any type while method(s) have the return type or void if does not return any value.
    // Constructors are called only once at the time of Object creation while method(s) can be called any number of times.
    public Dog () {

    }

}
