//Write a program to find The larger of three numbers 

//if elsf if condition
public class GreaterThree {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > a && b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }

    }
}
