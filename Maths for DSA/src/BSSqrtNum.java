public class BSSqrtNum {
    public static void main(String[] args) {
        int n = 3;
        int decimalValue = 3;

        System.out.println(sqrt(n, decimalValue));
        // for printing 3 decimal values
        System.out.printf("%.3f", sqrt(n, decimalValue));
    }
    // O(log N)
    static double sqrt(int n, int decimalValue){
        int start = 0;
        int end = n;
        double root = 0.0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid * mid == n){
                return mid;
            }
            if(mid * mid > n){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        double incr = 0.1;
        for (int i = 0; i < decimalValue; i++) {
            while(root * root <= n){
                root += incr;
            }

            root -= incr;
            incr /= 10;

        }

        return root;
    }
}
