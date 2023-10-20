package lesson5.Homework;
import java.util.Scanner;
public class QuestionEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt(); 
        int result = (((num1+5)*3)%(int)(num2/2)); 

        System.out.println(result);

        in.close(); 
    }
}
