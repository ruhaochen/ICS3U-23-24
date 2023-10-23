package lesson4;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println((int)Math.pow(num,2));
        in.close();
    }
}
