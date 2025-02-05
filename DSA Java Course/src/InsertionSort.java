import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr)); // Print sorted array
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }

        }
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void bubble(int[] arr) {
        boolean swapped;
        // Run the steps n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            // For each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) { // Inner loop starts from index 1
                // Swap if the current item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;

                }
            }
            // if you did not swap for a particular of i, it means the array is sorted hence stop the program
            if(!swapped) {  //!false = true
                break;
            }
        }
    }

}
