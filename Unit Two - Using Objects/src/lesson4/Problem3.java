package lesson4;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.println(Math.sqrt(num));
        
        in.close();
    }
}
