package Arrays.Arrays2d;
//2d array is basically a collection of multiple 1d arrays.
//A 2d array stores the reference of all the 1d arrays and has one different reference for itself.
public class DataStorage {
    public  static void main(String[] args){
        int [][] arr = {{1,2,3,4,5},{1,3,2,5,4},{2,4,6,8,10}};
        //Reference for array at 0th index.
        System.out.println(arr[0]);
        //Reference for array at 1st index.
        System.out.println(arr[1]);
        //Reference for array at 2nd index.
        System.out.println(arr[2]);
        //Reference for array itself.
        System.out.println(arr);
        //However, when we give the precise location with the row and column it will give us the element present.
        System.out.println(arr[2][1]);
        //arr.length in a 2d array will give you number of rows.
        System.out.println(arr.length);
        //arr[0].length  will give you the number of columns.
        System.out.println(arr[0].length);

    }
}
