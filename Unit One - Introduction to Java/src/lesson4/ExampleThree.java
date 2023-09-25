package lesson4;

public class ExampleThree {
    public static void main(String[] args) {
        int mark1 = 84, mark2 = 91, mark3 = 97; 
        int numTests = 3;

        // Three types of Errors: 

        // Logic Errors: if your program runs, doesn't crash but is not the expected output. The coder makes the mistake
        double average = mark1 + mark2 + mark3 / (double)numTests;

        // Runtime Errors: Runs, but crashes when it is running e.g x/10: throws an exception. 
        int num = 7/0;

        /*Exception in thread "main" java.lang.ArithmeticException: / by zero
        at lesson4.ExampleThree.main(ExampleThree.java:14) */


        // Syntax Error: Won't run (compile), red squiggle, error in the Java Code, e.g. forgetting a "" or forgetting a ;
        // System.out.print(HelloWorld)

    }
}
