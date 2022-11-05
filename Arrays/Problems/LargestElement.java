package Arrays.Problems;

import java.util.Scanner;
public class LargestElement {
    public static int largestElement(int [] arr){
        //n = arraySize
        //largestElement = - infinity (Integer.Min_Value)
        int n= arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            //update largestElement.
            if (arr[i] > largest){
                largest = arr[i];
            }

        }
        // return largestElement.
        return largest;
    }

    public static void main(String[] args){
        //TakeInput
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i =0; i <n; i++){
            arr[i] = sc.nextInt();
        }
        // Calling function largestElement() with array as parameter.

        int a= largestElement(arr);
        // print a.
        System.out.println(a);

    }
}
