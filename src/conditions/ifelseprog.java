//prog1
//package conditions;
//import java.util.Scanner;
//
//public class ifelseprog {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a no.");
//        int n = sc.nextInt();
//
//        if(n<1000 && n>99) {
//            System.out.println("the entered no. is of three digits");
//        }
//        else{
//            System.out.println("the number is not a 3 digit no.");
//
//        }
//
//    }
//}


//prog2

//package conditions;
//import java.util.Scanner;
//
//public class ifelseprog {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter three integers");
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        int n3 = sc.nextInt();
//
//        if (n1 > n2 && n1>n3) {
//                System.out.println("n1 is greatest");
//        }
//        else if (n2 > n1 && n2>n3) {
//                System.out.println("n2 is greatest");
//        }
//        else if(n3>n1 && n3>n2){
//            System.out.println("n3 is the greatest");
//        }
//    }
//prog3

package conditions;
import java.util.Scanner;

public class ifelseprog{
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("enter the x coordinate of the point");
        int x = sc.nextInt();
        System.out.println("enter the y coordinate if the point");
        int y = sc.nextInt();

        if(x==0){
            System.out.println("point lies on the y axis");

        }
        else{
            System.out.println("poitn lies on the x axis");
        }
    }
}








