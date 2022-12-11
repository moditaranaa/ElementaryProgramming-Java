package Strings;

public class Substring {
    //substring is the part of the string.
    //If string is "coding", then "co","cod", "ding" and many more are the substrings .
    //To find the substring of a string we use the substring function.
    public static void main(String[] args){
        String str= "coding";
        //beginIndex is mentioned in the ().
        System.out.println(str.substring(2));
        //Creating a substring
        String str1 = str.substring(2);
        //Checking the length of the substring.
        System.out.println(str1.length());



        //using start and end index.
        //charAT(5) is exclusive here
        String sbstr= str.substring(1,5) ;
        //Checking the length of the substring.
        System.out.println(sbstr);
        System.out.println(sbstr.length());



    }

}
