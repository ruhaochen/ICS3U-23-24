package lesson2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class WhileLoopExamples {
    public static void main(String[] args) {
        //exampleOne();
        //exampleTwo();
        //int result = exampleThree();
        //int result = exampleFour(10, 20);
        // int result = exampleFive(1, 1000);
        // System.out.println(result);
        int result = exampleSix(1, 100);
        System.out.println(result);
    }

    private static int exampleSix(int min, int max) {
        int sum = 0;
        
        int i = min;

        while(i<max){
            sum += i;
            i++;
        }
        
        return sum;
    }

    private static int exampleFive(int min, int max) {
        int sum = 0;

        for (int i = 0; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    private static int exampleFour(int min, int max) {
        Scanner in = new Scanner(System.in);
        boolean isValid = false;
        int result = 0;
        while(!isValid){
            System.out.print("Please enter a number from " + min + " to " + max + ": ");

            try{
                result = Integer.parseInt(in.nextLine());
                if(result<10||result>20)
                    System.out.println("Not in the specified range");
                else
                    isValid = true;
            }catch(NumberFormatException VERYBadThing){
                System.out.println("ENTER A NUMBER ERIC!!");
            }
        }
        return 0;
    }

    private static int exampleThree() {
        Scanner in = new Scanner(System.in);
        int result = -1;

        while(result<1||result>10){
            System.out.print("Please enter a number from 1 to 10: ");
            result = in.nextInt();
        }

        return 0;
    }

    private static void exampleTwo() {
        int numEven = 0;
        for (int i = 0; i < 1000; i++) {
            if ((int) (Math.random()*10+ 1) % 2==0){
                numEven++;
            }
        }
        System.out.println(numEven/(double)1000);
    }

    private static void exampleOne() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
