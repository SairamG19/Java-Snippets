public class Factorial2 {
    public static void main(String[] args) {
        int a = 10;
        int fact = 1;
        for (int i = a; i >= 1; i--) {

            fact = fact * i;

        }
        System.out.println("factorial of " + a + " is " + fact);
    }
}