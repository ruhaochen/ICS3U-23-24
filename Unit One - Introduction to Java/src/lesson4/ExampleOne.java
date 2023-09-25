package lesson4;

public class ExampleOne {
    public static void main(String[] args) {
        int mark1 = 84, mark2 = 91, mark3 = 97; 
        int numTests = 3; 

        double average = (mark1 + mark2 + mark3) / (double)numTests; 

        System.out.println(average);

        //cast int -> double we get more precision. (widening conversion)
    }
}
