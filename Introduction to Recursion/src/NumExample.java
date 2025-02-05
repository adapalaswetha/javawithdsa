public class NumExample {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n == 5){ // Base Condition
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // Recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack
        print(n + 1); // This is called Tail Recursion --> This is  the last function call
    }
}
