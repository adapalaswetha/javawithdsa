public class FibonacciSeries {
    public static void main(String[] args) {
        // find the fibonacci series
        for(int i = 0; i < 11; i++){
            System.out.println(fiboFormula(i));
        }
        // find nth fibonacci number
        System.out.println(fiboFormula(50));
    }
    static int fiboFormula(int n){
        // just demo, use long instead
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
}
