package BasicsToJava;

public class Conditions4 {
    //Nested If-else.
    //if (if - else) - else
    //Conditions - L4
    public static void main(String[] args){
        int n = 10;
        int x = 6;
        if (n>x){
            if (n == 10){
                System.out.println("n is 10 and so, it is greater than x.");}

            else{
                System.out.println("n is greater than x.");
            }
        }
        else {
            System.out.println("n is less than x");
        }
    }
}
