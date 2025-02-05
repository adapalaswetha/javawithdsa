public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(90000609));

    }
    // using helper function
    static int count(int n){
        return helper(n, 0);
    }
    private static int helper(int n, int c){
        if(n == 0){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return helper(n/10, c+1);
        }
        else{
            return helper(n/10, c);
        }
  //      return rem == 0 ? helper(n/10, c+1) : helper(n/10, c); --> simple way
    }


}
