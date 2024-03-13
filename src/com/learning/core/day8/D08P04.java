package com.learning.core.day8;
import java.util.LinkedList;
import java.util.Queue;

public class D08P04 {
    public static void main(String[] args) {
        // Input 1
        Queue<String> queue1 = new LinkedList<>();
        queue1.add("Yellow");
        queue1.add("Green");
        queue1.add("Pink");
        queue1.add("Black");
        queue1.add("Blue");
        queue1.add("White");

        // Output 1
        if (isEmpty(queue1)) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }

        // Input 2
        Queue<String> queue2 = new LinkedList<>();

        // Output 2
        if (isEmpty(queue2)) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }
    }

    private static boolean isEmpty(Queue<?> queue) {
        return queue.isEmpty();
    }
}
