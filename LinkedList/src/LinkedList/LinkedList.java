package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }
    }

    private Node first = null;
    private Node last = null;
    private int size = 0;

    public void addFirst(int element){
        Node newNode = new Node(element);
        // If list is empty, first and last point to the new Node
        if (isEmpty())
            first = last = newNode;
        // If list is not empty
        else{
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public void addLast(int element){
        var newNode = new Node(element);
        // If list is empty, first and last point to the new Node
        if (isEmpty())
            first = last = newNode;

        // If list is not empty
        else{
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void removeFirst(){
        if (isEmpty())
            throw new NoSuchElementException();

        // if the list has a single element
        if (first == last){
            first = last = null;
            return;
        }

        var secondNode = first.next;
        first.next = null;
        first = secondNode;

        size--;
    }

    public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last)
            first = last = null;
        else{
            // if list has  more than one element
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    public boolean contains(int value){
        return indexOf(value) != -1;
    }

    public int indexOf(int value){
        int index = 0;
        var currentNode = first;
        while (currentNode!=null) {
            if (currentNode.value == value)
                return index;
            index++;
            currentNode = currentNode.next;
        }
        return -1;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        int index = 0;
        var current = first;
        while(current!=null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse(){
        if (isEmpty()) return;

        var previous = first;
        var current = first.next;
        while (current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;

        // My code
        /*
        var previous = getPrevious(last);
        last.next = previous;
        while(previous!=first){
            Node prevPrevious = getPrevious(previous);
            previous.next = prevPrevious;
            previous = prevPrevious;
        }
        previous.next = null;
        first = last;
        last = previous;
        */
    }

    public int getKthFromTheEnd(int k){
        if (isEmpty())
            throw new IllegalStateException();

        if (k>size)
            throw new IllegalArgumentException();
        var current1 = first;
        if (size>1){
            Node current2 = first;
            for (int i=1; i<=(k-1); i++)
                current2 = current2.next;
            while (current2!=last){
                current1 = current1.next;
                current2 = current2.next;
            }
        }
        return current1.value;
    }

    private boolean isEmpty(){
        return first==null;
    }

    private Node getPrevious(Node node){
        var currentNode = first;
        while (currentNode != null){
            if (currentNode.next == node)
                return currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }


}
