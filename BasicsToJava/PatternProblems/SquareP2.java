import java.util.Scanner;

public class SquareP2 {
/*
Square patterns numeric
Assume n= 4;
Output :
1111
2222
3333
4444
 */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1; i<=n; i++)
        {
            for(int j=1; j <=n; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }


}
