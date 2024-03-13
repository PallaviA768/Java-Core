package com.learning.core.day8;
public class D08P03 {
    private static final int MAX_SIZE = 3;
    private int front, rear, size;
    private int[] queue;

    public D08P03() {
        queue = new int[MAX_SIZE];
        front = rear = -1;
        size = 0;
    }

    public void enqueue(int element) {
        if ((rear + 1) % MAX_SIZE == front) {
            System.out.println("Queue is full. Cannot enqueue " + element);
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % MAX_SIZE;
        }
        queue[rear] = element;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return;
        }
        System.out.println("Removed element: " + queue[front]);
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % MAX_SIZE;
        }
        size--;
    }

    public void display() {
        System.out.print("Elements in circular queue: ");
        int count = 0;
        int index = front;

        while (count < size) {
            System.out.print(queue[index] + " ");
            index = (index + 1) % MAX_SIZE;
            count++;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public static void main(String[] args) {
        D08P03 circularQueue = new D08P03();

        circularQueue.enqueue(14);
        circularQueue.enqueue(13);
        circularQueue.enqueue(22);

        circularQueue.display();

        circularQueue.dequeue();

        circularQueue.display();
    }
}
