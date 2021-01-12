package ArrayQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.toString());
        System.out.println(queue.dequeue());
        System.out.println(queue.toString());
        System.out.println(queue.peek());
        queue.enqueue(50);
        System.out.println(queue.toString());
        queue.enqueue(60);
        System.out.println(queue.toString());
        System.out.println(queue.isFull());
        queue.dequeue();
        System.out.println(queue.toString());
        System.out.println(queue.isFull());
        System.out.println(queue.toString());


    }

}
