package Arrays;

import java.util.Scanner;

public class ArraysAndFunctions {
    public static void printArray(int[] arr){
        //To print an array
        System.out.println(" Array : \n");
        int arraySize = arr.length;
        for(int i = 0; i<arraySize; i++){


            System.out.println(arr[i]);
        }


    }
    public static int[] takeInput(){
        // Taking input
        Scanner sc= new Scanner(System.in);
        int arraySize = sc.nextInt();
        int arr[] = new int[arraySize];

        for(int i=0; i<arraySize; i++){
            System.out.println("Enter an element at " + i + "th index" );
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = takeInput();
        printArray(arr);


    }
}
