import java.util.Scanner;

public class userFact {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = S.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of " + num + " is " + fact);

    }
}
