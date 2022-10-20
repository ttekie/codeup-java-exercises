public class Person {
    private String name;
    // getter
    public String getName() {
    //TODO: return the person's name
        return name;
    }
    // setter
    public void setName(String name) {
    //TODO: change the name field to the passed value
        this.name = name;
    }
    // instance method
    public void sayHello() {
    //TODO: print a message to the console using the person's name
        System.out.printf("My name is %s%n", name);
    }
    public String toString() {
        return name;
    }
    // when we create a custom constructor it overwrite
    // the implicit constructor
    public Person (String name) {
        this.name = name;
    }

}
