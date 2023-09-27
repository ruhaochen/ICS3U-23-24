package lesson5;

import java.util.Scanner;

public class ExampleThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a temperature in Fahrenheit: ");
        int fahrenheit = in.nextInt();

        double celcius = ((double)fahrenheit - 32) * 5 / 9;

        System.out.println("The temperature in Celcius is: " + celcius);

        in.close();

    }
}