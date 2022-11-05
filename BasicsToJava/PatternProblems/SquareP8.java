import java.util.Scanner;

public class SquareP8 {
/*
Square patterns Char
Assume n= 4;
Output :
ABCD
EFGH
IJKL
MNOP
 */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        char p = (char)('A'+i-1);
        for(; i<=n; i++)
        {
            for(int j=1; j <=n; j++)
            {
                System.out.print(p);
                p= (char)(p+1);

            }

            System.out.println();
        }

    }


}
