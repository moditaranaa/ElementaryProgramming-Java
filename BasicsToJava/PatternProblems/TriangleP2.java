import java.util.Scanner;

public class TriangleP2 {
/*
Triangle patterns numeric
Assume n= 4;
Output :
1
22
333
4444
 */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1; i<=n; i++)
        {
            for(int j=1; j <=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }


}
