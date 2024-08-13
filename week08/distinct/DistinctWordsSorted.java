package week08.distinct;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class DistinctWordsSorted {
    public static void main(String[] args) {
        String[] names = {"Rashad", "Rauf", "Ayxan", "Omar", "Farid", "Ayyub", "Racid", "Rasim"};
        Set<String> sortedNames = new TreeSet<>(Arrays.asList(names));
        String[] sortedArray = sortedNames.toArray(new String[0]);

        System.out.println(Arrays.toString(sortedArray));
    } 
}
