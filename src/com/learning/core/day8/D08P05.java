package com.learning.core.day8;
import java.util.LinkedList;
import java.util.Queue;

public class D08P05 {
    public static void main(String[] args) {
        // Input
        Queue<Integer> inputQueue = new LinkedList<>();
        inputQueue.add(2);
        inputQueue.add(5);
        inputQueue.add(4);
        inputQueue.add(6);
        inputQueue.add(795);
        inputQueue.add(10);

        // Output
        Queue<Integer>[] result = splitQueue(inputQueue);

        // Displaying the result
        displayQueue("Odd Queue", result[0]);
        displayQueue("Even Queue", result[1]);
    }

    private static Queue<Integer>[] splitQueue(Queue<Integer> inputQueue) {
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> evenQueue = new LinkedList<>();

        while (!inputQueue.isEmpty()) {
            int currentElement = inputQueue.poll();
            if (currentElement % 2 == 0) {
                evenQueue.add(currentElement);
            } else {
                oddQueue.add(currentElement);
            }
        }

        Queue<Integer>[] result = new Queue[]{oddQueue, evenQueue};
        return result;
    }

    private static void displayQueue(String label, Queue<Integer> queue) {
        System.out.print(label + ": ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
    }
}