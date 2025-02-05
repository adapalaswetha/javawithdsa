import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Swetha";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toCharArray());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(Arrays.toString(name.getBytes())); // get ASCII values of Swetha
        System.out.println(name.endsWith("y"));
        System.out.println(name.indexOf("e"));// gives index value of mentioned character
        System.out.println("    Swetha     ".strip());// removes white spaces
        System.out.println(Arrays.toString("Swetha Adapala Sricharan Govindolla".split(" ")));
        System.out.println(name.substring(1));
    }
}
