import java.util.Arrays;
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] result = flipAndInvertImage(image);
        for (int[] row : result) {
            System.out.print(Arrays.toString(row));
        }

    }
    static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            // reverse the array
            for (int i = 0; i < (row.length + 1) / 2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[row.length - i - 1] ^ 1;
                row[row.length - i - 1] = temp;

            }
        }
        return image;

    }
}
