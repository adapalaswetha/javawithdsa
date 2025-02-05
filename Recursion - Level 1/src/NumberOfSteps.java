
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14,0));

    }
    public int numberOfSteps(int num, int steps) {
        if(num == 0){
            return steps;
        }
        return num%2 == 0 ? numberOfSteps(num/2, steps+1) : numberOfSteps(num-1, steps+1);
    }

    public int numberOfSteps(int num) {
        return helper(num, 0);
    }
    private int helper(int num, int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){
            return helper(num/2, steps+1);
        }
        return helper(num - 1, steps+1);
    }
}
