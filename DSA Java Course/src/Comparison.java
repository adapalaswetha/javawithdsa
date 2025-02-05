import java.sql.SQLOutput;

public class Comparison {
    public static void main(String[] args) {
        // creating objects of same value in one string pool
        String a = "Swetha";
        String b = "Swetha";
        System.out.println(a == b);

        // creating different objects of same value
        String name1 = new String("Swetha");
        String name2 = new String("Swetha");
        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2)); // Need to check only value
    }
}
