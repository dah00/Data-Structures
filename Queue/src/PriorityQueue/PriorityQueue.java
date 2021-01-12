package PriorityQueue;

import java.util.Arrays;

public class PriorityQueue {
    int[] items = new int[7];
    int index = 0;
    int first = 0;

    public void add(int item){
        if (isEmpty())
            items[index++] = item;
        if (index == items.length)              // Full array
            throw new IllegalStateException();
        else{
            for (int i=index-1; i>=0; i--){
                if (items[i] < item){
                    items[i+1] = item;
                    index++;
                    break;
                }
                items[i+1] = items[i];
            }
        }
    }

    public int remove(){
        if (isEmpty())
            throw new IllegalStateException();
        return items[first++];
    }

    private boolean isEmpty(){
        return index == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
