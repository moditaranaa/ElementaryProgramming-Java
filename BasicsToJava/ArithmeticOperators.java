package BasicsToJava;

public class ArithmeticOperators {
    /*
        Arithmetic Operators according to their Precedence-
            1. ()
            2. In whatever order they are from left to right  - /, *, %
            3. +-
     */
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = 4;
        int d = 2;
        int e = 7;
        int sum = a + b;
        int difference = b - a;
        int product = a * b;
        int div = b / a;
        int toCheck = ((a + e) / c) * d;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(div);
        System.out.println(toCheck);

    }
}

