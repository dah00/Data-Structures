package StackArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.push(110);
        stack.push(120);
        stack.push(130);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.isEmpty());

    }
}
