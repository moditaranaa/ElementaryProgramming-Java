package BasicsToJava;

public class LogicalOperators2 {
    /*
        Logical Operators -
            1. AND
            2. OR
            3. NOT
     */
    // Using OR operator.
    public static void main(String[] args) {
        int a = 4;
        int b = 16;

        if(a>10 || b>10){
            System.out.println("Using OR");
        }
        else {
            System.out.println("Some condition failed");
        }

    }
}
