package sorting;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] arr = {1, -5, 8, 90, 7, 5, 7, 34, -29};

        display(arr);
        //SelectionSort(arr);
        InsertionSort(arr);
        display(arr);
    }

    private static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = 0;
            for (j = i; j > 0 && arr[j] > temp; j--) {
                arr[j+1] = arr[j];
            }
            arr[j] = temp;
        }
        // for (int i = 1; i < arr.length; i++) {
        //     int temp = arr[i];
        //     int j = 0;
        //     while (j > 0 && temp < arr[j-1]) {
        //         arr[j] = arr[j-1];
        //         j--;
        //     }

        //     arr[j] = temp;
        // }
    }

    private static void SelectionSort(int[] arr) {
        // look for the smallest and swap with index i
        for (int i = 0; i < arr.length-1; i++) {
            int smallestIndex = i;          // assume smallest is at the front of unstorted
            for (int j = i + 1; j < arr.length; j++) {  // fine the smallest
                if(arr[j] < arr[smallestIndex])
                    smallestIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp; 

        }
    }

    private static void display(int[] arr) {
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
