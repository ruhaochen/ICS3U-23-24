import java.util.Scanner;
public class ExcerciseThree {
    public static void main(String[] args) {
        String result = "";
        int x = 15;
        int y= 5;
        if (x < 5) {
            if (y > 0){
                result += "a";
            }else{
                result += "b";
            }
        }else if (x > 10){
            if (y < 0){
                result += "c";
            }else if (y < 10){
                result += "d";
            }
            result += "e";
        }
        result += "f";
        System.out.println(result);
    }
    
}
