public class OddEven {
    public static void main(String[] args) {
        int n = 11;
       isOdd(n);
       // System.out.println(isOdd(n)
    }
    // To print Odd or Even
    static void isOdd(int n){
         if ((n & 1) == 1){
             System.out.println("Odd");
        }
         else{
             System.out.println("Even");
         }
    }

    // To print True or false
    // static int isOdd(n){
    //     return (n & 1) == 1;
    //}
}