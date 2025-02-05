public class CountZeros1 {
    public static void main(String[] args) {
        System.out.println(count(9080006, 0));

    }
    static int count(int n, int c){
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        return rem == 0 ? count(n / 10, c + 1) : count(n / 10, c);
    }
}