package methods;
import java.util.Scanner;

public class sumwithoutobject {

    static int sum(int a, int b) {
        int ans = a + b;
        return ans;
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter two numbers");
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("the sum of the numbers is ");
            int ans = sum(x,y);
            System.out.println(ans);


        }
}