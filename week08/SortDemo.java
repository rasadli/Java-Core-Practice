package week08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(3, 2, 1, 12, 5);
        Collections.sort(al);
        System.out.println(al);

        List<Integer> list = Arrays.asList(3, 2, 1, 12, 5);
        list.sort(null);
        System.out.println(list);

        // creating instance of anonymous class
        List<Integer> list2 = Arrays.asList(3, 2, 1, 12, 5);
        Collections.sort(list2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list2);

        // creating concrete class and implementing Comparator
        List<Integer> list3 = Arrays.asList(3, 2, 1, 12, 5);
        list3.sort(new IntegerComparator());
        System.out.println(list3);

    }

    public static class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    }

}
