package arrays;
import java.util.Scanner;

public class elcount {
    static int count;

    static int count(int arr[],int x){
        for (int i = 0; i <5 ; i++) {
            if(x==arr[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the elements of the array");
        for (int i = 0; i <5 ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to be searched");
        int x = sc.nextInt();

        int ans = count(arr,x);
        System.out.println(ans);


    }

}
