import java.util.Scanner;

public class SquareP4 {
/*
Square patterns char
Assume n= 4;
Output :
AAAA
BBBB
CCCC
DDDD
 */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1; i<=n; i++)
        {   char p = (char)('A'+i-1);
            for(int j=1; j <=n; j++)
            {
                System.out.print(p);

            }
            p= (char)(p+1);
            System.out.println();
        }

    }


}
