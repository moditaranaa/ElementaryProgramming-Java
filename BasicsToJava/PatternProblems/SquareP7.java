import java.util.Scanner;

public class SquareP7 {
/*
Square patterns Char
Assume n= 4;
Output :
ABCD
BCDE
CDEF
DEFG
 */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1; i<=n; i++)
        {  char p = (char)('A'+i-1);
            for(int j=1; j <=n; j++)
            {
                System.out.print(p);
                p= (char)(p+1);

            }

            System.out.println();
        }

    }


}
