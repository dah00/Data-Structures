package FirstNonRepeatingCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class CharFinder {
    Map<Character, Integer> map = new HashMap<>();

    public char findFirstNonRepeatingChar(String str){

        for (char chr: str.toCharArray()){
            var value = map.containsKey(chr) ? map.get(chr) : 0;
            map.put(chr, ++value);
        }

        for (char chr: str.toCharArray())
            if (map.get(chr) == 1)
                return chr;

        return Character.MIN_VALUE;
    }


}
