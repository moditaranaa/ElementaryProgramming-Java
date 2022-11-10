package Arrays.Arrays2d;
//This program is to declare a 2d array using user Input.

import java.util.Scanner;
public class TakeInputIn2dArrays {
    public static void main(String[] args){
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
    for(int i =0; i<Rows; i++){

        for (int j =0; j <Col; j++){
            System.out.print(arr[i][j]);

        }
        System.out.println();
    }
}}
