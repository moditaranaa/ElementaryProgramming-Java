package SearchingAndSorting;
import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void print(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
    }

    public static int[] scan()
    {
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int [] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;

    }
    public static void main(String[] args){
        int[] a = scan();
        selectionSort(a);
        print(a);

    }
}
