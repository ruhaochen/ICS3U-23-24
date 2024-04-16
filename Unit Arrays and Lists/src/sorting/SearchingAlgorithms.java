package sorting;

import java.util.Arrays;

public class SearchingAlgorithms {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            int[] arr = new int[(int)Math.pow(10,i)];
            binarySearch(arr, 1);
            //insertionSort(arr);
            //selectionSort(arr);
            //Arrays.sort(arr);
            //System.out.println("Done for size: " + (int)Math.pow(10,i));
       }
    }

    private static int binarySearch(int[] arr, int val) {
        int count = 1;
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int mid = (low + high) / 2;

            if(arr[mid] == val){
                System.out.println("Size: " + arr.length + "Iterations: " + count);
                return mid;
            }else if (arr[mid] < val)
                low = mid + 1;
            else 
                high = mid - 1;
            count ++;
        }
        System.out.println("Size: " + arr.length + " - Iterations: " + count);
        return -1;
    }
    

    private static int sequentialSearch(int[] arr, int val) {
       for (int i = 0; i < arr.length; i++) {
        if (arr[i] == val)
            return i;
       }

       return -1;
    }

    private static void display(int[] arr) {
        for (int i : arr) {
           System.out.print(i + " ");
        }

        System.out.println();
    }
}