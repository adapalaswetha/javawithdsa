package Google_Amazon_Questions;
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

import java.util.ArrayList;
import java.util.Arrays;

public class PhonePad {
    public static void main(String[] args) {
        pad("", "12");
        System.out.println(); // Printing New Line
        System.out.println(pad1("", "12"));
        System.out.println(padCount("", "12"));
    }
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    // Using ArrayList
    static ArrayList<String> pad1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';// this will convert '2' into 2
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            list.addAll(pad1(p + ch, up.substring(1)));
        }
        return list;
    }

    // Return the count
    static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }

}
