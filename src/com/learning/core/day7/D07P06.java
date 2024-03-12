package com.learning.core.day7;

import java.util.Stack;

public class D07P06 {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int element) {
        mainStack.push(element);

        if (minStack.isEmpty() || element <= minStack.peek()) {
            minStack.push(element);
        }
    }

    public int pop() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        int poppedElement = mainStack.pop();

        if (poppedElement == minStack.peek()) {
            minStack.pop();
        }

        return poppedElement;
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return minStack.peek();
    }

    public static void main(String[] args) {
        D07P06 stack = new D07P06();

        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(1);

        System.out.println("Minimum element in the stack: " + stack.getMin());

        stack.pop();
        stack.pop();

        System.out.println("Minimum element in the stack after popping: " + stack.getMin());
    }
}
