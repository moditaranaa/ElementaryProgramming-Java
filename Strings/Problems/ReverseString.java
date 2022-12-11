package Strings.Problems;

import java.util.Scanner;

public class ReverseString {
    public static String reverse(String str) {
        int n = str.length();
        //creating a reverseString .
        String rev = "";
        //starting from the last character we kept adding all the character from our str to the new - reverseString.

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + (str.charAt(i));
        }
        return rev;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String a = reverse(str);
        System.out.println(a);

    }
}
