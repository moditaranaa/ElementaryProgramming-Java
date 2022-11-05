package Arrays.Problems;

import java.util.Scanner;
public class ReturnArraySum {
    //Sum of all the elements of an array.
    // Function using parameter int[] arr ,i.e, the array.
    public static int sum(int[] arr){
        int  sum=0;
        int n= arr.length;

        for(int i=0; i<n; i++){
            sum= sum+arr[i];

        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        int sum = sum(arr);
        System.out.println(sum);


    }
}
