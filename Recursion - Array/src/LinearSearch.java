import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 8, 22, 56};
        System.out.println(search(arr, 8, 0));
        System.out.println(search1(arr, 8, 0)); // prints first index value of 8
        System.out.println(search2(arr, 8, arr.length - 1));// prints last index value of 8
        search3(arr, 8, 0);
        System.out.println(list);

        System.out.println(search4(arr, 8, 0, new ArrayList<>()));
        System.out.println(search5(arr, 8, 0));

    }

    // boolean expression
    static boolean search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || search(arr, target, index + 1);
    }

    // Return the value from start
    static int search1(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        } else{
            return search1(arr, target, index + 1);
        }
    }

    // Return the value from last
    static int search2(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        } else{
            return search2(arr, target, index - 1);
        }
    }

    // Return the both indexes if target num is repeated using outside ArrayList
    static ArrayList<Integer> list = new ArrayList<>();
    static void search3(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        search3(arr, target, index + 1);
    }

    //Return the both indexes if target num is repeated using ArrayList --> Best approach
    static ArrayList<Integer> search4(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return search4(arr, target, index + 1, list);
    }

    // Return the list without passing the argument
    static ArrayList<Integer> search5(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        // this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = search5(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
