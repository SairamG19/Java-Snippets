public class Factorial_by_recursion {

    static int fact = 1;

    public static void main(String[] args) {

        int n = 20;
        Factorial_by_recursion ob = new Factorial_by_recursion();
        ob.calcFact(n);
        System.out.println("factorial of:" + n + "is" + fact);

    }

    void calcFact(int n) {
        if (n >= 1) {
            fact = fact * n;
            calcFact(n - 1);
        }
    }
}
