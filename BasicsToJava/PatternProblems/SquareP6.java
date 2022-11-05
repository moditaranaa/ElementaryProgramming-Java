import java.util.Scanner;

public class SquareP6 {
    /*
        Square patterns Num
        Assume n= 4;
        Output :
       4321
       4321
       4321
       4321
     */
        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            int n = s.nextInt();
            for(int i =1; i<=n; i++)
            {
                int j=n;
                for(; j>=1; j--)
                {
                    System.out.print(j);


                }

                System.out.println();
            }

        }


    }


