package week10.stack;

public class Stack {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("Cannot peek from an empty stack");
        }

        return top.data;
    }

    public int pop() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("Cannot pop from an empty stack");
        }

        int data = top.data;
        top = top.next;
        return data;
    }

    public void push(int el) {
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
        Stack stack = new Stack();

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);

        System.out.println("Current stack:");
        stack.__print();

        // Attempting to pop elements from the stack
        try {
            while (!stack.isEmpty()) {
                System.out.println("Popped element: " + stack.pop());
            }
        } catch (StackUnderflowException e) {
            System.out.println(e.getMessage());
        }

        // After popping all elements, the stack should be empty
        System.out.println("Stack after popping all elements:");
        stack.__print();

        // Attempting to peek or pop from an empty stack to demonstrate error handling
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
