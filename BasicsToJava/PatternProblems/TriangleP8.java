import java.util.Scanner;

public class TriangleP8 {
/*
Square patterns Numeric
Assume n= 4;
Output :
1
23
345
4567
 */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int i =1;

        for(; i<=n; i++)
        {
            for(int j=1, p=i; j <=i; j++)
            {
                System.out.print(p);
                p++;
            }
            System.out.println();
        }

    }


}
