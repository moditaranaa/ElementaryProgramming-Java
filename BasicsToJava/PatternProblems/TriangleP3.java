import java.util.Scanner;

public class TriangleP3 {
/*
Triangle patterns Numeric
Assume n= 4;
Output :
1
12
123
1234
 */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1; i<=n; i++)
        {
            for(int j=1; j <=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }


}
