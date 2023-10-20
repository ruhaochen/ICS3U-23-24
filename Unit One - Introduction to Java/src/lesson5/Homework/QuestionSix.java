package lesson5.Homework;
import java.util.Scanner;
public class QuestionSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the first side: ");
        int side1 = in.nextInt();
        System.out.print("What is the second side: ");
        int side2 = in.nextInt(); 

        double hypotenuse = Math.sqrt(((double)side1)*(side1) + (double)side2 * side2); 
    
        System.out.println("The hypontenuse is " + hypotenuse);
        in.close();
    }
}
