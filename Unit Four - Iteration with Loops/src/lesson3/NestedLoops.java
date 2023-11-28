package lesson3;

public class NestedLoops {
    public static void main(String[] args) {
        rectangle(5,4, "+");
        triangle1(5, "#");
        triangle2(5, "#");
        triangle3(5, "#");

    }

    private static void triangle3(int height, String symbol) {
        for (int row = 1; row <= height; row++){
            for (int col = 0; col < row-1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= height-row; col++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private static void triangle2(int height, String symbol) {
        for (int row = 1; row <= height; row++) {
            for (int col = 0; col <= height-row; col++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private static void triangle1(int height, String symbol) {
        for (int row = 0; row <= height; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private static void rectangle(int rows, int cols, String symbol) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
