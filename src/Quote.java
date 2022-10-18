public class Quote {
    public static String RandomQuote() {
        int random = (int) Math.floor(Math.random() * 4);
//        String[] Quates = {"Time is money.", "Pure Vida.", "Knowledge is power.", "With great power comes great responsibility."};
//        return Quates[random];
        return switch (random) {
            case 1 -> "Time is money";
            case 2 -> "Pure Vida";
            case 3 -> "Knowledge is power";
            case 4 -> "with great power comes great responsibility";
            default ->
                    "Bringing solar as a renewable energy resource for those who are not able to install solar panels on their roofs allows more communities to benefit from a solar array.";
        };
    }
}
