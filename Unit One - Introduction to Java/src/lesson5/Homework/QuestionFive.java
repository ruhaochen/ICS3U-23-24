package lesson5.Homework;
import java.util.Scanner;
public class QuestionFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the original price: ");
        int originalPrice = in.nextInt();

        double finalPrice = ((double)originalPrice*0.8)*1.13; 
        System.out.println("The final price is " + finalPrice);

        in.close();
    }
}
