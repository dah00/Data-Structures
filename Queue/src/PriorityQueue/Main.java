package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(50);
        System.out.println(priorityQueue.toString());
        priorityQueue.add(20);
        priorityQueue.add(70);
        System.out.println(priorityQueue.toString());
        priorityQueue.add(40);
        System.out.println(priorityQueue.toString());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.toString());

//        Queue<Integer> queue = new PriorityQueue<>();
//        queue.add(3);
//        queue.add(2);
//        queue.add(5);
//        queue.add(1);
//        queue.add(4);
//
//        while(!queue.isEmpty())
//            System.out.println(queue.remove());
    }
}
