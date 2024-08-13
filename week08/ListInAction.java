package week08;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class ListInAction {
    public static void main(String[] args) {
        // a
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        // b
        System.out.println(integerList.toString());

        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }
        System.out.println();

        for (Integer number : integerList) {
            System.out.print(number + " ");
        }
        System.out.println();

        Iterator<Integer> it = integerList.iterator();
        while (it.hasNext()) {
            Integer element = it.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // c
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");

        System.out.println(shoppingList.toString());

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.print(shoppingList.get(i) + " ");
        }
        System.out.println();

        for (String element : shoppingList) {
            System.out.print(element + " ");
        }
        System.out.println();

        Iterator<String> it2 = shoppingList.iterator();

        while (it2.hasNext()) {
            String element2 = it2.next();
            System.out.print(element2 + " ");
        }
        System.out.println();

        shoppingList.remove("bread");
        System.out.println(shoppingList.toString());

        shoppingList.remove(2);

        // d
        ArrayList<String> newShoppingList = new ArrayList<>(shoppingList);
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");
        System.out.print(newShoppingList.toString());
        System.out.println();

        if (newShoppingList.contains("tea")) {
            System.out.println("Tea is in the list");
        } else {
            System.out.println("Tea is not in the list");
        }

        // e

        LinkedList<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("tomato");
        newLinkedList.add("potato");
        newLinkedList.addAll(newShoppingList);
        newLinkedList.removeFirst();
        System.out.print(newLinkedList.toString());
        System.out.println();
        newLinkedList.removeLast();
        System.out.print(newLinkedList.toString());
        System.out.println();
    }

}