package Strings;

public class Basics {
    public static void main(String[] args){
        String str ="Coding";
        System.out.println(str.length());
        //Accessing a particular index .
        System.out.println(str.charAt(2));
        //An Empty string.
        String str1 ="";
        System.out.println(str1.length());
        //A space in an empty string.
        String str2 =" ";
        System.out.println(str2.length());

        //concatenating strings.
        String str3 ="is fun!";
        System.out.println(str + str2+ str3);

        //using concat function
        str = str.concat(str2).concat(str3);
        System.out.println(str);
        //using += for concatenation.
        str2 += str3;
        System.out.println(str3);
        System.out.println(str2);

        //To check if the strings are equal.
        //using equal function
        //String str1 =""; String str2 =" "; are not equal, os it should give false.
        System.out.println(str1.equals(str2));

        //Compare to function.
        // str1 is "" and str2 = " ".
        // so it compared both the string and where it was not a match it gave the difference of the ASCII values
        System.out.println(str1.compareTo(str2));


        //contains functions.
        // if str contains ing it will give true, and it does contain ing .
        System.out.println(str.contains("ing"));
        //Substring function







    }
}
