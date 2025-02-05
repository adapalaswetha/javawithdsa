public class RevNum {
    public static void main(String[] args) {
        revNum1(123);
    }

    // My answer
    static void revNum(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        n = n/10;
        System.out.print(rem);
        revNum(n);
    }

    // Method-1
    static int sum = 0;
    static void revNum1(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        revNum1(n/10);
    }
}
