package Arrays;

public class DeclaringArrayChar {
    //Array is a type of data structure that stores homogeneous type of elements simultaneously one after the other.
    //Array uses the concept of indexing.
    //The first element will be available at 0th index of the array.

    public static void main(String[] args){
        // syntax = datatype array_name[] = new datatype[array_size];
        // This is an example of a char array.
        char arr[] = new char[10];
        //Adding elements in the array.
        //Initially all the values in a char array are null. So, the elements at indexes which are not updated will return null values.
        arr[0]= 'h';
        arr[1]='I';
        arr[4]= 'n';
        arr[6]='a';
        // print(arr[i])

        System.out.println(arr[4]);
        System.out.println(arr[0]);
        //Note: Negative indexing cannot be done.
        // if we try : arr[-1]= 'y'; it will give the following error -
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 10 at DeclaringArray.main(DeclaringArray.java:17)



        // Similarly we cannot have any more indexes than the declared arraysize. So we can say the index range is from 0 to arraysize -1.
        //arr[10] = 'y'; This will give the following array.
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
        //	at DeclaringArray.main(DeclaringArray.java:23)

    }

}
