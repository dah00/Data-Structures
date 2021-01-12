package LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addLast(20);
//        list.addLast(30);
//        list.addLast(40);

        System.out.println(list.getKthFromTheEnd(-1));

        int[] array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
