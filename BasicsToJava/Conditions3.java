package BasicsToJava;

public class Conditions3 {
    //Nested If-else.
    //if - elseif - else
    //Conditions - L3
    public static void main(String[] args){
        int n = 10;
        int x = 6;
        // Only 1 statement will run out of all the 3 statements.
        if (n>x){
            System.out.println("n is greater than x");

        }
        else if (n == 10) {
            System.out.println("n is equal to x");

        }
        else {
            System.out.println("n is less than x");
        }
    }
}
