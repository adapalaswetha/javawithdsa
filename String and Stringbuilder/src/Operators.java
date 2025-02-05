import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // It add ASCII values of 'a' and 'b'
        System.out.println("a" + "b"); // Concatination of two strings
        System.out.println('a' + 3); // It prints the ASCII value of d
        System.out.println((char)('a' + 3)); // Casting

        System.out.println("a" + 1);// when a integer is added/concatinated to string, it converted into RAPPER class
        // this is same as after a few steps: "a" + "1"
        // integer will be converted into integer that will call toString()

        System.out.println("Swetha" + new ArrayList<>());
        System.out.println("Swetha" + new Integer(1905));

//        System.out.println(new Integer(1905) + new ArrayList<>()) --> It gives an error
        // "new Integer(1905) + new ArrayList<>()" is like an expression, expression + in Java, you can only use with "PRIMITIVES" and you can use with all the "COMPLEX OBJECTS" but the only condition is atleast one of these objects should be "STRING"

        System.out.println(new Integer(1905) + "" + new ArrayList<>());

        System.out.println("a" + 'b'); // If one of the data type is string, then ans will be String
    }
}
