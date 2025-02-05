public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(product(0));
    }
    static int product(int n){
        if(n == 0){ // if( n% 10 == n)
            return n;
        }
        int rem = n % 10;
        return rem * product(n / 10);
    }
}
