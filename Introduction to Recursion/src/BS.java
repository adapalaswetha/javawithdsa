public class BS {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 24, 35, 54, 78};
        int target = 24;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
    static int search(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target > arr[mid]){
            return search(arr, target, mid + 1, end);
        }
        return search(arr, target, start, mid - 1);
    }
}
