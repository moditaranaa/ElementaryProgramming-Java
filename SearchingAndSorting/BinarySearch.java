package SearchingAndSorting;
import java.util.Scanner;
public class BinarySearch {
    //to be resolved. (incomplete)
    //To search an element in an array and if it is available return the index of the element in the array and if it is not available return -1.
    //In binary search we take two pointers start and end.
    //and we calculate mid of the two.
    public static int BinarySearch(int[] arr, int element) {

        int e = arr.length;
        int s = 0;

        int toFind = element;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == toFind) {
                return mid;
            } else if (arr[mid] < toFind) {
                s = mid + 1;
            } else if (arr[mid] > toFind) {
                e = mid - 1;

            }
        }

        return -1;

    }

    public static void main(String[] args){
        //declaring an array
        //calling functions.

        Scanner sc= new Scanner(System.in);

        int[] arr = new int[7];
        int n = sc.nextInt();
        for (int i =0; i<n; i++){
            System.out.println("Enter an element at " + i + "th index.");
            arr[i]= sc.nextInt();
        }
        System.out.println("What element do you wanna search?");
        int x = sc.nextInt();
        int a = BinarySearch(arr,x);
        System.out.println("Your element is available at");
        System.out.println(a + " index");


    }

}
