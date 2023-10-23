package lesson4;
import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ASCII = (int)(Math.random()*26)+65;

        char letter = (char)ASCII;

        System.out.println(ASCII);
        System.out.println(letter);
        in.close();
    }
}
