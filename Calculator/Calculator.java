
// Write A program to create a calculator
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = S.nextInt();
        System.out.println("Enter second number");
        int b = S.nextInt();
        System.out.println("Select Symbol(+,-,/,*)");
        String sym = S.next();
        int res;
        switch (sym) {
            case "+":
                res = a + b;
                System.out.println("Add is" + res);
                break;
            case "-":
                res = a - b;
                System.out.println("Sub is" + res);
                break;
            case "*":
                res = a * b;
                System.out.println("Mul is" + res);
                break;
            case "/":
                res = a / b;
                System.out.println("Divide is" + res);
                break;
            default:
                res = 0;

        }
    }
}