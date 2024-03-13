package com.learning.core.day8;

public class D08P01 {
    private static final int MAX_SIZE = 5;
    private int front, rear, size;
    private int[] queue;

    public D08P01() {
        queue = new int[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int element) {
        if (size == MAX_SIZE) {
            System.out.println("Queue is full. Cannot enqueue " + element);
            return;
        }
        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = element;
        size++;
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot dequeue");
            return;
        }
        System.out.println("Removed element: " + queue[front]);
        front = (front + 1) % MAX_SIZE;
        size--;
    }

    public void display() {
        System.out.print("Elements in queue: ");
        int count = 0;
        int index = front;

        while (count < size) {
            System.out.print(queue[index] + " ");
            index = (index + 1) % MAX_SIZE;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        D08P01 queue = new D08P01();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        queue.dequeue();

        queue.display();
    }
}