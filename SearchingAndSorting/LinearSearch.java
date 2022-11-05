package SearchingAndSorting;

import java.util.Scanner;
public class LinearSearch {
    //To search an element in an array and if it is available return the index of the element in the array and if it is not available return -1.
    public static int linearSearch(int[] arr, int element) {
        int i = 0;
        int j = -1;
        for (; i < arr.length; i++) {
            if (arr[i] == element) {
                j= i;
                break;
            }

        }
        return j;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i =0; i<n; i++){
            System.out.println("Enter an element at " + i + "th index.");
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element to search in an array");
        int toFind = sc.nextInt();

        int a= linearSearch(arr,toFind);
        System.out.println("the element is at " + a + "th index.");
    }
}
