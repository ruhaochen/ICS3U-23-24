package lesson4;
import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word1 = in.next();
        System.out.print("Enter a word: ");
        String word2 = in.next(); 
        
        if(word1.compareTo(word2)<0){
            System.out.println("First String comes before");
        }else if(word1.compareTo(word2)==0){
            System.out.println("Both are equal");
        }else{
            System.out.println("Second String comes before"); 
        }
        in.close();
    }
}
