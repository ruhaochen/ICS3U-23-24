package lesson3;
import java.util.Scanner;
public class ECOOContest2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        wordFrame(word); 
        in.close();
    }

    private static void wordFrame(String word) {
        System.out.print("*" + word + "*");
        System.out.println();
        for (int i = 0; i < word.length(); i++){
            System.out.print(word.substring(word.length()-i-1, word.length()-i));
            for (int j = 0; j < word.length(); j++){
                System.out.print("*");
            }
            System.out.print(word.substring(i, i+1));
            System.out.println();
        }
        System.out.print("*");
        for (int i = 0; i < word.length(); i++){
            System.out.print(word.substring(word.length()-i-1, word.length()-i));
        }
        System.out.print("*");
    }
}
