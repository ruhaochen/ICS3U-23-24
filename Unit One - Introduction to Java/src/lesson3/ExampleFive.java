package lesson3;

public class ExampleFive {
    public static void main(String[] args) {
        int mark1 = 80, mark2 = 88, mark3 = 97;
        double average = (mark1 + mark2 + mark3) / 3.0;

        // we need to divide by 3.0 so we do double math
        // divide by 3 and we do int math and get 88.0 for average
        
        System.out.println(average);

    }
}
