package com.learning.core.day8;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class D08P02 {
    private Node front, rear;

    public D08P02() {
        front = rear = null;
    }

    public void enqueue(int element) {
        Node newNode = new Node(element);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty. Cannot dequeue");
            return;
        }
        System.out.println("Removed element: " + front.data);
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }

    public void display() {
        System.out.print("Elements in queue: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        D08P02 queue = new D08P02();

        queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.display();
    }
}
