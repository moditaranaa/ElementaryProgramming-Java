import java.util.Scanner;

public class TriangleP7 {
    /*
        Triangle patterns numeric
        Assume n= 4;
        Output :
       1
       23
       456
       78910
     */
        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            int n = s.nextInt();
            int i =1;
            int p=i;
            for(; i<=n; i++)
            {

                for(int j =1; j<=i; j++)
                {
                    System.out.print(p);
                    p ++;


                }

                System.out.println();
            }

        }


    }


