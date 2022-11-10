package Arrays.Arrays2d.Problems;

import java.util.Scanner;


public class RowWiseSum {
    //input function.
    public static int[][] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows required in the table");
        int Rows = s.nextInt();
        System.out.println("Enter the columns required in the table");
        int Col = s.nextInt();
        int [][] arr = new int[Rows][Col];
        for(int i =0; i<Rows; i++) {

            for (int j = 0; j < Col; j++) {
                System.out.println("Enter the element at " + i + "th and " + j + "th column");
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    //sum function
    public static void rowWiseSum(int[][] mat) {
        int rows = mat.length;
        // if rows is 0 then, return.
        if (rows ==0){
            return;
        }
        int col = mat[0].length;

        for (int i = 0; i < rows; i++) {
            int sum= 0;
            //taking sum of all the columns in a row
            for (int j = 0; j < col; j++) {
                sum = sum + mat[i][j];
            }
            // printing the sum
            System.out.print(sum + " ");
        }
    }
    //main
    public static void main(String[] args){
        int[][] a = takeInput();
        rowWiseSum(a);


    }
}
