//package inputs;
//import java.util.Scanner;
//public class sum0f2 {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter the first no.");
//        int first;
//        first = sc.nextInt();
//        System.out.println("enter the second no.");
//        int second;
//        second= sc.nextInt();
//        int sum;
//        sum= first+second;
//        System.out.println(sum);
//    }
//
//}

package inputs;
import java.util.Scanner;

public class sum0f2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a= sc.nextInt();
        System.out.println("enter b");
        int b= sc.nextInt();
        int q=a/b;
        int r= a-b*q;
        System.out.println(r);

    }
}

