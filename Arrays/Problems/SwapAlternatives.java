package Arrays.Problems;

import java.util.Scanner;
/*
sample input
1 3 4 2 6 7 8 0
sample output :
3 1 2 4 7 6 0 8
swapping a pair

 */

public class SwapAlternatives {
    public static void swapAlternate(int arr[])
    {
        int n= arr.length;
        //If array length is even.
        if (n%2==0)
        {
            for(int i =0; i <n;){
                int temp = arr[i];
                arr[i] = arr[i +1];
                arr[i+1]= temp;
                i = i+2;
            }
        }
        //If array length is odd, we will not change the final element's place.
        else
        {
            for(int i =0; i <n-1;)
            {
                int temp = arr[i];
                arr[i] = arr[i +1];
                arr[i+1]= temp;
                i = i+2;
            }

        }
    }
    // print function
    public static void print(int [] arr){
        int n = arr.length;
        for (int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    //main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Array size ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println(" Enter element at" + i +"th index.");
            arr[i] = sc.nextInt();
        }
        for (int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        swapAlternate(arr);
        System.out.println(" Here you go! ");
        print(arr);


}}
