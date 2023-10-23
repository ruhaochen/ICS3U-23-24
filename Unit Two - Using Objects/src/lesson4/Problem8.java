package lesson4;
import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word1 = in.next();
        System.out.print("Enter another word: ");
        String word2 = in.next(); 

        System.out.println(word1 + word2);
        in.close(); 
        
    }
}
