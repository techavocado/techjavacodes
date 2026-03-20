package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class smallandlarge {

    static int[] smallandlarge1(int arr[]){
        Arrays.sort(arr);
        int ans[] ={arr[0], arr[arr.length-1]};
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
        int[]ans = smallandlarge1(arr);
        System.out.println("the smallest and largest element of the array are: "+ans[0]+","+ans[1]);

    }
}
