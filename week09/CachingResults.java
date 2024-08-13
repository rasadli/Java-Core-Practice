package week09;

import java.util.HashMap;
import java.util.Map;

public class CachingResults {

    private Map<String, Character[]> c = new HashMap<>();

    public Character[] mostLeastFrequent(String inputString) {
        if (c.containsKey(inputString)) {
            return c.get(inputString);
        }

        Map<Character, Integer> count = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        Character mostFrequent = null;
        Character leastFrequent = null;
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() > maxFreq) {
                mostFrequent = entry.getKey();
                maxFreq = entry.getValue();
            }

            if (entry.getValue() < minFreq) {
                leastFrequent = entry.getKey();
                minFreq = entry.getValue();
            }

        }

        Character[] result = { mostFrequent, leastFrequent };
        c.put(inputString, result);

        return result;
    }

    public static void main(String[] args) {

        CachingResults cr = new CachingResults();
        String inputString = "Principles of Programing";
        Character[] mostLeastFreq = cr.mostLeastFrequent(inputString);
        System.out.println("Most Frequent character: " + mostLeastFreq[0]);
        System.out.println("Least Frequent character: " + mostLeastFreq[1]);

        mostLeastFreq = cr.mostLeastFrequent(inputString);
        System.out.println("Most Frequent character (cached): " + mostLeastFreq[0]);
        System.out.println("Least Frequent character (cached): " + mostLeastFreq[1]);
    }
}
