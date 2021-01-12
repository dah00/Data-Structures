package FirstRepeatedCharacter;

public class Main {
    public static void main(String[] args) {
        String str = "apple green";

        CharFinder finder = new CharFinder();

        System.out.println(finder.firstRepeatedCharacter(str));
    }
}
