package lesson6;
import java.util.Scanner;
public class wordProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length and width (input two numbers): ");
        int length = in.nextInt();
        int width = in.nextInt();

        System.out.print("What is the depth of the shallow and deep end (intput two numbers): ");
        int shallowHeight = in.nextInt();
        int deepHeight = in.nextInt();

        System.out.print("What is the transition between the shallow end and the deep end: ");
        int transition = in.nextInt();

        System.out.print("What is the length of the shallow end: ");
        int shallowLength = in.nextInt();

        System.out.print("What is the price per meter squared of the liner: ");
        int linerCost = in.nextInt();
         
        int a = deepHeight - shallowHeight;
        double c = (double)transition;
        double b = Math.sqrt(c*c-a*a);
        
        double trapezoid = (((length - shallowLength)+(length-shallowLength-b))*(deepHeight-shallowHeight))/2;
        double volumeOfPool = ((length*width*shallowHeight) + trapezoid*width);

        System.out.println("The amount of water needed to keep the pool 90% full is " + 0.9*volumeOfPool + "meters cubed");
        
        double side = (length*shallowHeight) +trapezoid;
        int back = deepHeight*width; 
        int front = shallowHeight*width;
        double base = ((length-shallowLength-b) + transition + shallowLength)*width;
        double surfaceArea = side*2 + back + front + base;

        System.out.println("The amount of liner needed to create the pool is " + surfaceArea + " meters squared");
        System.out.println("The cost of the liner is " + surfaceArea*linerCost);
        in.close();
    }
}
