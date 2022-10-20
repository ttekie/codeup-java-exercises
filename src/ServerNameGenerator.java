public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] array1 = {"aggressive", "agreeable", "alert", "alive", "amused", "angry", "annoyed", "annoying", "anxious", "arrogant"};
        String[] array2 = {"place", "work", "week", "time", "point", "government", "company", "number", "group", "problem"};
        String adjective = array1[randomNumber()];
        String noun = array2[randomNumber()];
        System.out.println(noun + "-" + adjective);
    }
    public static int randomNumber() {
        return (int) Math.floor(Math.random() * 10);
    }
}
