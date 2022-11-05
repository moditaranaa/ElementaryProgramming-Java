package Arrays;

import java.util.Scanner;
public class TakingInputToCreateAnArray {
    public static void main(String[] args){
        // Taking input
        Scanner sc= new Scanner(System.in);
        int arraySize = sc.nextInt();
        int arr[] = new int[arraySize];

        for(int i=0; i<arraySize; i++){
            System.out.println("Enter an element at " + i + "th index" );
            arr[i] = sc.nextInt();
        }
        //To print an array
        System.out.println(" Array : \n");
        for(int i = 0; i<arraySize; i++){


            System.out.println(arr[i]);
        }

    }
}