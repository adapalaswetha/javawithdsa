public class FactorialNum {
    public static void main(String[] args) {
  //      System.out.println(factorial(5));
        System.out.println(sum(6));
    }
    static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
// sum of numbers
    static int sum(int n){
        if(n <= 1){
            return 1;
        }
        return n + sum(n - 1);
    }
}
