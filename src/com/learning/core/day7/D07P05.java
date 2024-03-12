package com.learning.core.day7;

import java.util.Stack;

public class D07P05 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);
        reverseStack(stack);
        System.out.println("Reversed Stack: " + stack);
    }

    static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Remove the top element
            int temp = stack.pop();

            // Recursively reverse the remaining stack
            reverseStack(stack);

            // Insert the top element at the bottom
            insertAtBottom(stack, temp);
        }
    }

    static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            // Remove all items from the stack
            int temp = stack.pop();

            // Recursively insert the item at the bottom
            insertAtBottom(stack, item);

            // Push back the other items
            stack.push(temp);
        }
    }
}
