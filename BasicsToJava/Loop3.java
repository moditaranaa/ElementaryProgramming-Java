package BasicsToJava;
import java.util.Scanner;
public class Loop3 {
    //BasicLoops - L3
    //Using while loops with user input.

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int  n = s.nextInt();

        int i=1;
        while(i<=n)
        {
            int j =1;
            while(j<=n)
            {
                System.out.print('*');
                j = j+1;
            }
            System.out.println();
            i = i+1;
        }
    }

}

