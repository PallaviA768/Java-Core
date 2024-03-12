package com.learning.core.day7;

import java.util.Stack;

public class D07P03 {
    public static void main(String[] args) {
        String input = "JavaQuiz";
        String reversedString = reverseString(input);
        System.out.println(input);
        System.out.println( reversedString);
    }

    private static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        
        // Push each character onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from the stack to reverse the string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
