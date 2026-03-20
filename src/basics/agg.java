package basics;
import java.util.*;

public class agg{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String name = sc.next();

        sc.nextLine();

        System.out.println("Enter Your FullName:");
        String fullName = sc.nextLine();

        System.out.println("Enter Your Age:");
        int age = sc.nextInt();

        System.out.println("Your Name:" + name);
        System.out.println("Your Full Name:" + fullName);
        System.out.println("Your Age:" + age);
    }
}