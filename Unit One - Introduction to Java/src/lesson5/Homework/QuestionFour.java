package lesson5.Homework;
import java.util.Scanner;
public class QuestionFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Distance: ");
        int distance = in.nextInt();
        System.out.print("Time: ");
        int time = in.nextInt();

        double speed = ((double)distance)/time;
        System.out.println("The speed is " + Math.round(speed*100.0)/100.0);

        in.close(); 
    }
}
