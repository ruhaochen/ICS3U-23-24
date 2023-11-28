package lesson3;
import java.util.Scanner;
public class ECOOContest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int P = in.nextInt();
        int Q = in.nextInt();
        pictureframe(N, M, P, Q);
        in.close();
    }

    private static void pictureframe(int n, int m, int p, int q) {
        int width = 2*q + 2*p + n;

        //Top part

        for (int i = 0; i < q; i++){
            for (int j = 0; j < width; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        //Between top and middle part

        for (int i = 0; i < p; i++){
            for (int j = 0; j < q; j++){
                System.out.print("#");
            }
            for (int k = 0; k < (n + 2*p); k++){
                System.out.print("+");
            }
            for (int j = 0; j < q; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        //Middle part

        for (int i = 0; i < m; i++ ){
            for (int j = 0; j < q; j++){
                System.out.print("#");
            }
            for (int k = 0; k < p; k++){
                System.out.print("+");
            }
            for (int j = 0; j < n; j++){
                System.out.print(".");
            }
            for (int k = 0; k < p; k++){
                System.out.print("+");
            }
            for (int j = 0; j < q; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        //Between middle and bottom part 

        for (int i = 0; i < p; i++){
            for (int j = 0; j < q; j++){
                System.out.print("#");
            }
            for (int k = 0; k < (n + 2*p); k++){
                System.out.print("+");
            }
            for (int j = 0; j < q; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        //Bottom part

        for (int i = 0; i < q; i++){
            for (int j = 0; j < width; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
