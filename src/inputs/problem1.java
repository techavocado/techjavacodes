package inputs;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("enter the positive integer");
        x = sc.nextInt();
        if(x%2!=0){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
}
