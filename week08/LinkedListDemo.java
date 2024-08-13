package week08;

import java.util.LinkedList;

/**
 * LinkedListDemo
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.offer("tomato");
        ll.addFirst("potato");
        System.out.println(ll);

    }
}