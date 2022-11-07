package Arrays.Problems;
import java.util.Scanner;

public class PrintAllPairs {
        public static void pairs(int arr[])
        {
            int n = arr.length;
            for (int i=0; i <n-1; i++)
            {
                for(int j=i+1; j<n; j++)
                {
                System.out.print(arr[i]);
                System.out.print("," + arr[j]);
                System.out.println();

                }
            System.out.println();
            }

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at " + i +"th index");
            arr[i] = sc.nextInt();
        }
        pairs(arr);


}}
