package QueueWithTwoStacks;

import java.util.Stack;

public class QueueWithTwoStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item){
        stack1.push(item);
    }

    public int dequeue(){
        if (isEmpty())
            throw new IllegalStateException();

        // reverse stack into stack2
        if (stack2.isEmpty())
            reverseStack1InStack2();

        return stack2.pop();
    }

    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();

        if (stack2.isEmpty())
            reverseStack1InStack2();

        return stack2.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }


    private void reverseStack1InStack2(){
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());
    }


    @Override
    public String toString() {

        return stack1.toString() + stack2.toString();
    }
}
