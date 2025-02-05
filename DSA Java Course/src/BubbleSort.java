import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {19, 67, 10, 5, 89};
        bubble(arr);
        System.out.println(Arrays.toString(arr)); // Print sorted array
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
