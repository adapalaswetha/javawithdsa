import java.sql.SQLOutput;
import java.util.Arrays;
//https://leetcode.com/problems/missing-number/
// Amazon Question
class MissingNumber {
    public static void main(String[] args){
        int[] arr = {3, 0, 4, 1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
