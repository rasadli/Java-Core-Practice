package week10;

import week10.stack.StackOverflowException;
import week10.stack.StackUnderflowException;

public class GenericStack<T> {

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public GenericStack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean isFull() {
        int maxSize = 5;
        int count = 0;
        Node current = top;

        while (current != null) {
            count++;
            if (count >= maxSize) {

                current = current.next;
            }
        }
        return false;
    }

    public T peek() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("Cannot peek from an empty stack");
        }

        return top.data;
    }

    public T pop() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("Cannot pop from an empty stack");
        }

        T data = top.data;
        top = top.next;
        return data;
    }

    public void push(T el) {

        if (isFull()) {
            throw new StackOverflowException("You cannot add a new node to full stack");
        }

        Node newNode = new Node(el);
        newNode.next = top;
        top = newNode;
    }

    public void __print() {
        if (this.isEmpty()) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.print("Top");
        Node current = top;
        while (current != null) {
            System.out.print(" || " + current.data);
            current = current.next;
        }
        System.out.println(" || Bottom");
    }

    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();

        stack.push("Rashad");
        stack.push("Omar");
        stack.push("Javid");
        stack.push("Rauf");
        stack.push("Farid");

        System.out.println("Current stack: ");
        stack.__print();

        try {
            while (!stack.isEmpty()) {
                System.out.println("Popped element: " + stack.pop());
            }
        } catch (StackUnderflowException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Stack after popping all elements: ");
        stack.__print();

        try {
            stack.peek();
        } catch (StackUnderflowException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            stack.pop();
        } catch (StackUnderflowException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
