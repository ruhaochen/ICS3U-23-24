package lesson3;

public class ExampleFour {
    public static void main(String[] args) {
        int num = 6731;

        int digit1 = num % 10;  
        int digit2 = num % 100 / 10;   
        int digit3 = num % 1000 / 100;  //digit3 = num / 100 % 10
        int digit4 = num / 1000;

        int sum = digit1 + digit2 + digit3 + digit4;
        // sum of the digits

        System.out.println(sum);
    }
}
