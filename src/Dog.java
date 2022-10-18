public class Dog {
    public String name;
    public String sound;

    public void makeNoise() {
        String quote = Quote.RandomQuote();
        System.out.printf("%s goes %s%n", name, quote);
    }

    public Dog (String name,  String sound) {
        this.name = name;
        this.sound = sound;
    }

}
