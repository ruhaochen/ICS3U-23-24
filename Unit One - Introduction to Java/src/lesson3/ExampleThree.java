package lesson3;

public class ExampleThree {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;

        double a = 7.0;
        double b = 2;

        // if both operands are int we get an int
        // if either operand is a double we get a double

        // 5 + 4 
        // + is the operator
        // 5 and 4 are the operands
        
        System.out.println(x+y);    // 9
        System.out.println(a+b);    // 9.0
        System.out.println(x+b);    // 9.0
        System.out.println();
        System.out.println(x/y);    // 3
        System.out.println(a/b);    // 3.5
        System.out.println(x/b);    // 3.5
        System.out.println(y/x);    // 0

    }
}
