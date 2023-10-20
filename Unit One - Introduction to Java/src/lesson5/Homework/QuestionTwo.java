package lesson5.Homework;
import java.util.Scanner;
public class QuestionTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many US dollars: ");
        int usDollars = in.nextInt();

        double canadianDollars = usDollars*1.25;
        System.out.println("$" + usDollars + " US = "  + canadianDollars + " CAD");

        in.close();
    }
}
