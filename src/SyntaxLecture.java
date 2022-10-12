public class SyntaxLecture {
    public static void main(String[] args) {
        // Declare variable without intializing
        int weight;
        String breed;
        // Initializing after declaration
        weight = 12;
        breed = "Cavalier King Charles Spaniel";
        // Initialize a and declare at the same time
        String name = "Grinch";
        int cutenessFactor = 10;
        // statement: "JVM, do something"
        System.out.println(name + " is a " + breed + ".");
        // Conditional logic
//        if (cutenessFactor > 8) {
//            System.out.println(name + " is cute.");
//        } else {
//            System.out.println(name + " needs to work on cuteness");
//        }

        boolean isGrinchCute = true;
        char oneLetter = 'a';
        byte smallNumber; // byte go from -128 t 127
        short mediumNumber; // short go form -32768 to 32768
        int number; // integers go c. -2 billion to 2 billion
        long bigNumber; // longs go about -9 quadrillion to 9 quadrillion

        bigNumber = 90000000000000L;

        float imafloat = 2.34F;
        double imadouble = 9.01234567890123;
        System.out.println(imadouble);
        imafloat = (float) imadouble;
        System.out.println(imafloat);

        System.out.println();


    }
}
