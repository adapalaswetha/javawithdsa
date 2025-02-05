public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(1678));
    }
    static int sumDigits(int n){
        if(n == 0){
            return 0;
        }
        int rem = n % 10;
        return rem + sumDigits(n / 10);
    }

    }
