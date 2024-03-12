package com.learning.core.day7;

class Node {
    double data;
    Node next;

    public Node(double data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(double data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public double pop() {
        if (top == null) {
            return -1; // Signaling an empty stack, you can handle it as needed
        }
        double popped = top.data;
        top = top.next;
        return popped;
    }

    public void display() {
        Node current = top;
        System.out.print("The elements of the stack are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class D07P02 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        double[] elements = {10.0, 20.0, 30.0, 40.0};

        for (double element : elements) {
            stack.push(element);
        }

        stack.display();

        // Pop twice
        stack.pop();
        stack.pop();

        stack.display();
    }
}

