package ArrayQueue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue {
    private int[] queue;
    private int front = 0;
    private int rear = 0;
    private int count = 0;

    ArrayQueue(int capacity){
        queue  = new int[capacity];
    }

    public void enqueue(int item){
        if (isFull())
            throw new IllegalStateException();
        queue[rear] = item;
        rear = (rear+1) % queue.length;
        count++;
    }

    public int dequeue(){
        if (isEmpty())
            throw new NoSuchElementException();

        var item = queue[front];
        queue[front] = 0;
        front = (front+1) % queue.length;
        count--;

        return item;
    }

    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();

        return queue[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == queue.length;
    }

    @Override
    public String toString() {
        //var content = Arrays.copyOfRange(queue,front, rear);
        return Arrays.toString(queue);
    }
}
