public class Nto1 {
    public static void main(String[] args) {
   //     fun(6);
    //    funRev(6);
        funBoth(7);
        concept(6);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        fun(n - 1);
    }

    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);
        System.out.print(n + " ");
    }

    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        funBoth(n - 1);
        System.out.print(n + " ");
    }
// --n vs n--
    static void concept(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        concept(--n); // It subtracts first and pass the value
        // concept(n--) --> It always pass n value only
    }
}

