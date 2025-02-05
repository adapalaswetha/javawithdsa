import java.util.Scanner;

public class CtoF {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temp in Celsius: ");
        float tempC = in.nextFloat();
        float tempF =(tempC * 9/5) + 32;
        System.out.print(tempF);
    }

}
