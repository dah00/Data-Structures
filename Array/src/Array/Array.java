package Array;

public class Array {
    private int[] myArray;
    private int count = 0;


    Array(int capacity){
        myArray = new int[capacity];
    }

    public void print(){
        for (int i=0; i<count; i++)
            System.out.println(myArray[i]);
    }

    public void insert(int value){
        // if array if full, resize it
        if (myArray.length==count){
            // create a new array (twice the size)
            int[] tempArray = new int[count*2];

            //Copy all the existing items
            for (int i=0; i<count; i++)
                tempArray[i] = myArray[i];

            // Set "myArray" to the new array
            myArray = tempArray;
        }

        // if the array is not full
        myArray[count++] = value;
    }

    public void removeAt(int index){
        // Validate the index
        if (index<0 || index>=count)
            throw new IllegalArgumentException();

        // Shift the array to the left to fill the hole
        for (int i=index; i<count; i++)
            myArray[i] = myArray[i+1];
        count--;
    }

    /*
       **Return -1 if value not found
     */
    public int indexOf(int value){
        for (int i=0; i<count; i++){
            if (myArray[i]==value)
                return i;
        }
        return -1;
    }


}
