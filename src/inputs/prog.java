package inputs;
import java.util.Scanner;

public class prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius;
        radius = sc.nextInt();
        double area=3.14*radius*radius;
        System.out.println(area);
    }
}



