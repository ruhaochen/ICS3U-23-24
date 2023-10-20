package lesson5.Homework;
import java.util.Scanner;
public class QuestionSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Weight: ");
        int weight = in.nextInt();
        System.out.print("Height: ");
        double height = in.nextDouble(); 

        double BMI = weight/(height*height);

        System.out.println("The BMI is " + BMI); 
        
        in.close(); 
    }
}
