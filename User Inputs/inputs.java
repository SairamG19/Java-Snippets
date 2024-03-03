
//Write a program to take take user inputs 
import java.util.Scanner;

class inputs {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the first Name:");
        String name1 = S.next();
        System.out.println("Enter the Last Name:");
        String name2 = S.next();
        System.out.println("Enter your phone number");
        long phone = S.nextLong();
        System.out.println("Enter your age");
        int age = S.nextInt();
        System.out.println("Enter your Gender");
        char gender = S.next().charAt(0);

        System.out.println(name1 + " " + name2 + " ");
        System.out.println("phone:" + phone);
        System.out.println("age:" + age);
        System.out.println("gender:" + gender);

    }

}