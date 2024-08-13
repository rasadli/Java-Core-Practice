package week08.distinct;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DistinctWords {
        public static void main(String[] args) {
        String[] names = {"Rashad", "Rauf", "Ayxan", "Omar", "Farid", "Ayyub", "Racid", "Rasim"};
        Set<String> distinctNames = new LinkedHashSet<>(Arrays.asList(names));
        String[] distinctArray = distinctNames.toArray(new String[0]);

        System.out.println(Arrays.toString(distinctArray));
    }
}
