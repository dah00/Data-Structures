package StackArray;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private int size = 10;
    private int[] array = new int[size];
    private int index = 0;

    public void push(int item){
        if (index>=size)
            array = reSize();
        array[index++] = item;
    }

    public int pop(){
        if (isEmpty())
            throw new IllegalStateException();
        return array[--index];
    }

    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();
        return array[index-1];
    }

    public boolean isEmpty(){
        return index==0;
    }

    private int[] reSize(){
        int[] newArray = new int[size*2];
//        newArray = Arrays.copyOfRange(array, 0, index);
        for (int i=0; i<size; i++)
            newArray[i] = array[i];
        size*=2;
        return newArray;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(array,0,index);
        return Arrays.toString(content);
    }
}
