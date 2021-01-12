package FirstRepeatedCharacter;

import java.util.HashSet;
import java.util.Set;

public class CharFinder {
    public char firstRepeatedCharacter(String str){
        Set<Character> set = new HashSet<>();
        // apple green
        //[a, p, l, e, g, r, n]

        for (char chr : str.toCharArray()){
            if (set.contains(chr))
                return chr;
            set.add(chr);
        }

        return Character.MIN_VALUE;
    }
}
