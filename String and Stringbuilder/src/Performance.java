public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;
        }
        System.out.println(series);
 //           System.out.println(ch);
 //           System.out.print(ch); // for above code, simply we write this line we get same output

    }
}
