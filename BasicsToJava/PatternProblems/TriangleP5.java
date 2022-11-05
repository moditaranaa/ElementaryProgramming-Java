import java.util.Scanner;

public class TriangleP5 {
/*
Triangle patterns Char
Assume n= 4;
Output :
A
AB
ABC
ABCD
 */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1; i<=n; i++)
        {
            for(int j=1; j <=i; j++)
            { char p = (char)('A'+j-1);
                System.out.print(p);
                p= (char)(p+1);

            }

            System.out.println();
        }

    }


}
