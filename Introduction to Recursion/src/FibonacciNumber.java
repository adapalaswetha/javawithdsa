
// find the nth fibonacci number
// 0, 1, 1, 2, 3, 5, 8, 13, 21, .......
public class FibonacciNumber {
    public static void main(String[] args) {
        int ans = fiboNum(6);
        System.out.println(ans);
    }
    static int fiboNum(int n){
        // base condition
        if( n < 2){
            return n;
        }
        return fiboNum(n-1) + fiboNum(n-2); // Recurrance Recursion

    }
}
