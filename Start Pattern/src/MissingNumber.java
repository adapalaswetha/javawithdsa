import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {3, 0, 4, 6, 1, 2};
        Arrays.sort(arr);
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }
}
