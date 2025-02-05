package Subset_Subsequence_String;

public class Stream {
    public static void main(String[] args) {
        skip("", "baccad");
        System.out.println(skip1("baccadahg"));
        System.out.println(skipApple("bcdapplefg"));
        System.out.println(SkipAppNotApple("bcdapptyufg"));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        } else{
            skip(p + ch, up.substring(1));
        }

    }

    // Return the ans
    static String skip1(String up){
        if(up.isEmpty()){ // base condition
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip1(up.substring(1));
        } else{
            return ch + skip1(up.substring(1));
        }
    }

    // Skip a String instead of character
    static String skipApple(String up){
        if(up.isEmpty()){ // base condition
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        } else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    // Skip app when it is not equal to apple
    static String SkipAppNotApple(String up){
        if(up.isEmpty()){ // base condition
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return SkipAppNotApple(up.substring(3));
        } else{
            return up.charAt(0) + SkipAppNotApple(up.substring(1));
        }
    }

}
