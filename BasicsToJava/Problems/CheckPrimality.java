package BasicsToJava.Problems;

import java.util.Scanner;

//To check if a number is prime or not.
public class CheckPrimality {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int div =2;
        for (int i =div; i<n ; i++){
            if (n%2 ==0){
                System.out.println("composite");
                return;
            }
        }
        System.out.println("prime");
    }
}
