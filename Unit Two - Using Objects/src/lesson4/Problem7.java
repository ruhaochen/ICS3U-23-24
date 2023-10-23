package lesson4;
import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        System.out.print("Enter a character: "); 
        String character = in.next();

        System.out.println(word.indexOf(character));
        in.close();
        
    }
}
