package Strings.Problems;
import java.util.Scanner;

public class CountWords {
    public static int count(String str){
        //words in a sentence is space +1, so we started c with 1.
        //for ex in a string -"I am a girl". We have 3 spaces but we have 3+1 words.
        int c=1;
        int n = str.length();
        //if str.length is 0 so c should be 0, so we will put a condition here for 0 length of the string!
        if (str.length()==0){
            return 0;
        }

        for(int i=0; i<n; i++){
            //separating each word if there's a space in between, so for that we can say - str.charAt(i)==' '.
            if (str.charAt(i) ==' ')
            {
                c= c+1;
            }
        }

        return c;
    }
    //main function
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int a =count(str);
        System.out.println(a);


    }
}
