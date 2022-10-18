public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Cooper", "Woff Woff");
        Dog dog2 = new Dog("Franki", "Wow Wow");
        Dog dog3 = new Dog("Charli", "buff buff");
//        dog1.name = "Cooper";
//        dog1.sound = "Woff Woff";
        dog1.makeNoise();
        dog2.makeNoise();
        dog3.makeNoise();

    }
}
