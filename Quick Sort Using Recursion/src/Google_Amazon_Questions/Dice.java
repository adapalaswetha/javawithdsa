package Google_Amazon_Questions;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceRet("", 4));
        System.out.println(diceCount("", 4));
        diceFace("", 6, 8);
        System.out.println(diceFaceRet("", 6, 8));
    }
    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);

        }
    }

    // Using ArrayList
    static ArrayList<String> diceRet(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceRet(p + i, target - i));

        }
        return list;
    }

    // Return Count
    static int diceCount(String p, int target){
        if(target == 0){
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            count = count + diceCount(p + i, target - i);

        }
        return count;
    }

    // DiceFace --> face means if dice contains more than 6 i.e 8 or 9 etc
    static void diceFace(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i, face);

        }
    }

    // Using ArrayList
    static ArrayList<String> diceFaceRet(String p, int target, int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceFaceRet(p + i, target - i, face));

        }
        return list;
    }
}
