package lesson5.Homework;
import java.util.Scanner;
public class QuestionNine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double principal = in.nextDouble();
        double interestRate = in.nextDouble();

        double total = (int)(principal*(1 + interestRate));

        System.out.println("The total interest is " + total);
        
        in.close();
    }
}
