package BasicsToJava;

public class Loop2
{
    //BasicLoops - L2
    //Using while loops
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
