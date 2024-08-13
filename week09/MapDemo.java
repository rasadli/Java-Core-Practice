package week09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        String inputString = args[0];

        Map<Character, ArrayList<Integer>> occ = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (!occ.containsKey(c)) {
                occ.put(c, new ArrayList<>());
            }
            occ.get(c).add(i);
        }

        System.out.println("Non-descending order: ");
        for (Entry<Character, ArrayList<Integer>> entry : occ.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Indexes: " + entry.getValue());
        }

        System.out.println("\nNon-ascending order: ");
        Comparator<Character> reverse = new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return c2.compareTo(c1);
            }
        };

        Map<Character, List<Integer>> descending = new TreeMap<>(reverse);
        descending.putAll(occ);

        for (Map.Entry<Character, List<Integer>> entry : descending.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Indexes: " + entry.getValue());
        }

    }

}
