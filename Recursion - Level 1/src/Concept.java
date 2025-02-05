public class Concept {
    public static void main(String[] args) {
        fun(6);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(--n); // It subtracts first and pass the value
        // fun(n--) --> It always pass n value only
    }
}
