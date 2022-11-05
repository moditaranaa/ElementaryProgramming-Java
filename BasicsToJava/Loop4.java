package BasicsToJava;

public class Loop4
{
    //BasicLoops - L4
    //Using for loops
    /*
    Assume n=3;
    output -
    ***
    ***
    ***
    */

    public static void main(String[] args)
    {
        int n = 4;

        for(int i=1;i<=n;i++)
        {
            for(int j =1; j<=n; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
