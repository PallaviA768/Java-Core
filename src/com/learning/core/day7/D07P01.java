package com.learning.core.day7;

 public class D07P01 {
    private int size;
    private String[] stack;
    private int top;

    public D07P01(int size) {
        this.size = size;
        this.stack = new String[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(String item) {
        if (!isFull()) {
            stack[++top] = item;
        }
    }

    public String pop() {
        if (!isEmpty()) {
            return stack[top--];
        }
        return null;
    }

    public void display() {
    	System.out.print("After Pushing 4 Elements: ");
       
        for (int i = 0; i <= top; i++) {
        	 
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int stackSize = 5;
        D07P01 stack = new D07P01(stackSize);

        String[] elementsToPush = {"Hello", "world", "Java", "programming"};

        for (String element : elementsToPush) {
            stack.push(element);
        }

        stack.display();

        // Pop one element
        stack.pop();

        System.out.print("After a Pop: ");
        stack.display();
    }
}
