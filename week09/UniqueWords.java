package week09;

import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class UniqueWords {
    public static void main(String[] args) {
        UniqueWords uniqueWords = new UniqueWords();
        String input = "Progrmaing";

        System.out.println(uniqueWords.getUniqueChar(input));
        System.out.println(uniqueWords.getUniqueChar(input));

        String input2 = "Calulus";

        System.out.println(uniqueWords.getUniqueChar(input2));
    }

    Map<String, Set<Character>> m = new HashMap<>();

    public Set<Character> getUniqueChar(String inputString) {
        
        if (m.containsKey(inputString)) {
            return m.get(inputString);
        }else {
            Set<Character> uniqueChar = new HashSet<Character>();

            for (char c : inputString.toCharArray()) {
                uniqueChar.add(c);
            }

            m.put(inputString, uniqueChar);
            return uniqueChar;

        }
    }

}
