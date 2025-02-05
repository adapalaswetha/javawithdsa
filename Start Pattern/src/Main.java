public class Main {
    public static void main(String[] args) {
        pattern31(5);
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern8(5);
        pattern17(5);
        pattern28(5);
        pattern30(5);

    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            // when one row is printed, we need to add one new line
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add one new line
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add one new line
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // when one row is printed, we need to add one new line
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColInRow; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add one new line
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col < row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add one new line
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;
            for (int s = 0; s < n - totalColInRow; s++) {
                System.out.print("  ");
            }
            for (int col = totalColInRow; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= totalColInRow; col++) {
                System.out.print(col + " ");
            }
            // when one row is printed, we need to add one new line
            System.out.println();
        }
    }


    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColInRow; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add one new line
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            // when one row is printed, we need to add one new line
            System.out.println();
        }
    }

    static void pattern31(int n) {
        int num = 2 * n;
        for (int row = 1; row < num; row++) {
            for (int col = 1; col < num; col++) {
                int atEveryIndex = n - (Math.min(Math.min(row, col), Math.min(num - row, num - col)));
                System.out.print(atEveryIndex + " ");
            }
            // when one row is printed, we need to add one new line
            System.out.println();
        }
    }
}
