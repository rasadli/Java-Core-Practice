package week09;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class SortedLinkedList {
    public static void main(String[] args) {

        long startTime1 = System.currentTimeMillis();

        LinkedList<Integer> ll1 = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            ll1.add((int) (Math.random() * 100));
        }

        Collections.sort(ll1);
        
        long endTime1 = System.currentTimeMillis();

        System.out.println("Duration 1(with Collections.sort() method): " + (endTime1 - startTime1));

        long startTime = System.currentTimeMillis();

        LinkedList<Integer> ll2 = new LinkedList<>();
        ListIterator<Integer> iterator = ll2.listIterator();
        boolean b = false;

        for (int i = 0; i < 10000; i++) {
            int n = (int) (Math.random() * 100);
            while (iterator.hasNext()) {
                int t = iterator.next();
                if (n < t) {
                    iterator.previous();
                    iterator.add(n);
                    b = true;
                    break;
                }
            }
            if (!b) {
                iterator.add(n);
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Duration 2(adding one element and sorting): " + (endTime - startTime));

    }
}
