package Arrays;

public class DeclaringArray {
    //Array is a type of data structure that stores homogeneous type of elements simultaneously one after the other.
    //Array uses the concept of indexing.
    //The first element will be available at 0th index of the array.

    public static void main(String[] args){
        // syntax = datatype array_name[] = new datatype[array_size];
        // This is an example of an int array.
        int arr[] = new int[10];
        //Adding elements in the array.
        //Initially all the values in an array are 0. So, the elements at indexes which are not updated will be 0.
        arr[0]= 5;
        arr[1]=8;
        arr[6]=9;
        // print(arr[i])

        System.out.println(arr[7]);
        System.out.println(arr[0]);
        //Note: Negative indexing cannot be done.
        // if we try : arr[-1]= 7; it will give the following error -
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 10 at DeclaringArray.main(DeclaringArray.java:17)



        // Similarly we cannot have any more indexes than the declared arraysize. So we can say the index range is from 0 to arraysize -1.
        //arr[10] = 9; This will give the following array.
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
        //	at DeclaringArray.main(DeclaringArray.java:23)

    }

}