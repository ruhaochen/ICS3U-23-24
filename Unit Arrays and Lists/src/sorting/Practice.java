package sorting;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, -5, 8, 90, 7, 5, 7, 34, -29};
        display(arr);
        // insertionSort(arr);
        // display(arr);
        selectionSort(arr);
        display(arr);
        System.out.println(binarySearch(arr, 7));
        System.out.println(sequentialSearch(arr, 8));
    }

    private static int sequentialSearch(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val)
                return i;
        }
        return -1; 
    }

    private static int binarySearch(int[] arr, int val) {
        int max = arr.length-1;
        int min = 0;
        
        while (min <= max){
            int mid = (max + min)/2;

            if (arr[mid] == val)
                return mid;
            else if (arr[mid] > val)
                max = mid -1;
            else
                min = mid +1; 

        }
        return -1; 
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int smallestIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[smallestIndex])
                    smallestIndex = j;
            }
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while(j > 0 && temp < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }

    private static void display(int[] arr) {
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
