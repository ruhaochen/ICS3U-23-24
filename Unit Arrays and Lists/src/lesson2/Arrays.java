package lesson2;

public class Arrays {
    public static void main(String[] args) {
        // exampleOne();
        //exampleTwo();
        //exampleThree();
        exampleFive();
    }

    private static void exampleFour() {
        int[] arr = {5,3,2,5,7,-1};

        for (int el : arr) {
            System.out.println(el);
        }
    }

    private static void exampleFive(){
        String[] words = {"Hello", "hi", "tada"};

        for (String str : words) {
            System.out.println(str.length());
        }
    }

    private static void exampleThree() {
        int[] marks = new int[10];

        for (int mark : marks) {
            mark = (int)(Math.random()*41) + 60;
        }

        for (int el : marks) {
            System.out.println(el);
        }
    }

    private static void exampleTwo() {
        int[] marks = new int[10];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int)(Math.random()*41) + 60;
        }

        for (int el : marks) {
            System.out.println(el);
        }
    }

    private static void exampleOne() {
        int[] arr = new int[5];

        // for (int el : arr) {
        //     System.out.println(el);
        // }

        int index = 2;

        arr[index] = 10;

        for (int el : arr) {
            System.out.println(el);
        }
    }
}
