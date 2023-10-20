package lesson5.Homework;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What's the radius: ");
        int radius = in.nextInt(); 

        double area = Math.PI*radius*radius;
        double circumference = 2*Math.PI*radius; 

        System.out.println("The Area with radius " + radius + " is " + area);
        System.out.println("The Circumference with radius " + radius + " is " + circumference);
        
        in.close(); 
    }
}
