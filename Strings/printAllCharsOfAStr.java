package Strings;
import java.util.Scanner;


public class printAllCharsOfAStr {
    public static void printChar(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            System.out.print("'" +str.charAt(i) +"'" );

        }
        System.out.println();
        System.out.println(str.length());
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        printChar(str);

    }
}
