import java.util.Scanner;

public class SquareP3 {
/*
Square patterns Numeric
Assume n= 4;
Output :
1234
1234
1234
1234
 */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1; i<=n; i++)
        {
            for(int j=1; j <=n; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }


}
