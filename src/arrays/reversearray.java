package arrays;
import java.util.*;

public class reversearray {

    static void printarray(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] reversearray(int arr[]){
        int n = arr.length;
        int ans[]= new int[n];
        int j=0;

        for (int i = n-1; i>-1 ; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = reversearray(arr);
        printarray(ans);

    }
}
