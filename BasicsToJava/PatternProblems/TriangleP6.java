import java.util.Scanner;

public class TriangleP6 {
    /*
        Triangle patterns numeric
        Assume n= 4;
        Output :
       4
       43
       432
       4321
     */
        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            int n = s.nextInt();
            for(int i =n; i>=1; i--)
            {
                int j=n;
                for(; j>=i; j--)
                {
                    System.out.print(j);


                }

                System.out.println();
            }

        }


    }


