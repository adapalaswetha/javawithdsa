import java.util.Arrays;
//leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Amazon question
public class FindallMissingNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }


    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
