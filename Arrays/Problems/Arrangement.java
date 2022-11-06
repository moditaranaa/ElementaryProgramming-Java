package Arrays.Problems;

public class Arrangement {
    public static int[] arrangement(int n) {
        int val= 1;

        int [] arr= new int[n];

        for (int i =0; i<n/2; i++) {
            arr[i] = val;
            val = val +2;
        }
        int val2= 2;
        for (int i =n-1; i>(n-1)/2; i--) {
            arr[i] = val2;
            val2 = val2 +2;
        }
        return arr;

    }
    public static void main(String[] args) {

        int[]  a= arrangement(6);
        for (int i =0; i<6; i++) {
            System.out.println(a[i]);
        }


    }

}
