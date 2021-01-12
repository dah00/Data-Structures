package FirstNonRepeatingCharacter;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String str = "a ggrlnreen apple";

        CharFinder finder = new CharFinder();
        System.out.println(finder.findFirstNonRepeatingChar(str));

    }
}
