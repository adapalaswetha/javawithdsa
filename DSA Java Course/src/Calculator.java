import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int res = 0;
        while(true){
            System.out.print("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(op == '+'){
                    res = num1 + num2;
                }
                if(op == '-'){
                    res = num1 - num2;
                }
                if(op == '*'){
                    res = num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                        res = num1 / num2;
                    }
                }
                if(op == '%'){
                    res = num1 % num2;
                }
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            System.out.println("The result is " + res);
        }
    }
}