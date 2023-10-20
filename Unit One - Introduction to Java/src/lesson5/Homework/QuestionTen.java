package lesson5.Homework;
import java.util.Scanner;
public class QuestionTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalMinutes = in.nextInt();
        int hours = totalMinutes/60;
        int minutes = totalMinutes%60; 

        System.out.println(hours + " hours " + minutes + " minutes.");

        in.close();
    }
}
