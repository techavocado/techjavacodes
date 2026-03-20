package methods;
import java.util.Scanner;

class Algebra{
    int sum(int a , int b){
        int ans = a+b;
        return ans;
    }
}

public class main {


    public static void main(String[] args) {
        Algebra obj = new Algebra();
                Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
                int x = sc.nextInt();
                int y = sc.nextInt();

        System.out.println("the sum of the numbers is ");
        int ans = obj.sum(x,y);
        System.out.println(ans);


    }
}