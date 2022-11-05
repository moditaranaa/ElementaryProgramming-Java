package BasicsToJava;

public class LogicalOperators {
    /*
       Logical Operators -
           1. AND
           2. OR
           3. NOT
    */
    // Using AND operator.
    public static void main(String[] args) {
        int a = 4;
        int b = 16;

        if(a>10 && b>10){
            System.out.println("Using AND");
        }
        else {
            System.out.println("Some condition failed");
        }

    }
}
