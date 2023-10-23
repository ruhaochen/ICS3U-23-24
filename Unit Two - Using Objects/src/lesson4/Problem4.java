package lesson4;
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = in.next();

        System.out.print("Enter the starting index: ");
        int start = in.nextInt();

        System.out.print("Enter the ending index: ");
        int end = in.nextInt();
        
        System.out.println(word.substring(start, end));
        
        in.close();
    }
}
