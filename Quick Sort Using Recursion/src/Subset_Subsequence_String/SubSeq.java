package Subset_Subsequence_String;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subSeq("", "abc");
        System.out.println(subSeqRet("", "abc"));
        subSeqAscii("", "ab");
        System.out.println(subSeqAsciiRet("", "abc"));

    }

    // Using Recursion
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    // Using ArrayList
    static ArrayList<String> subSeqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqRet(p + ch, up.substring(1));
        ArrayList<String> right = subSeqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    // Print Ascii value along with Subsequence
    static void subSeqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeqAscii(p + ch, up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p + (ch+0), up.substring(1));
    }

    // Print Ascii value along with Subsequence using ArrayList
    static ArrayList<String> subSeqAsciiRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqAsciiRet(p + ch, up.substring(1));
        ArrayList<String> right = subSeqAsciiRet(p, up.substring(1));
        ArrayList<String> middle = subSeqAsciiRet(p + (ch + 0), up.substring(1));


        left.addAll(right);
        left.addAll(middle);
        return left;
    }
}
