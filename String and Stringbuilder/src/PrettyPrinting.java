public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 143.1234f;
        System.out.printf("Formatted number is %.2f", a);
        System.out.println();

        System.out.println(Math.PI);
        System.out.printf("Pie: %.3f", Math.PI);
        System.out.println();

        System.out.printf("My name is %s and I am %d years old", "Swetha", 21 );
    }
}
