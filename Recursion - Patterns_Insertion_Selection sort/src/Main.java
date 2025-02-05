public class Main {
    public static void main(String[] args) {
        pattern1(4);
    }

    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i - 1 ; j++) {
                System.out.println("* ");

            }
            System.out.println();

        }

    }
}