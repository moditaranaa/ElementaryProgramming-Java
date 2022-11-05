import java.util.Scanner;
public class SquareP1 {
/*
Square patterns stars
Assume n= 4;
Output :
****
****
****
****
 */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1; i<=n; i++)
        {
            for(int j=1; j <=n; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }

    }


}
