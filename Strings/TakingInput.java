package Strings;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str;
        str = s.next();
        //s.next will return you the next token.
        //Scanner deals will the input in form of tokens.
        //"ab de ah aj" then one token is sequence of character until you find a delimiter.
        //By default, a delimiter is a space- " ", a tab or an enter.
        // so everything before a delimiter is one token.
        System.out.println(str + " " + str.length());
        //s.nextLine() will give you the entire line.
        String str1 = s.nextLine();
        System.out.println(str1 + " " + str1.length());

    }
}
