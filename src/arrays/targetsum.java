package arrays;
import java.util.Scanner;

public class targetsum {

    static int checksum(int arr[],int target){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==target){
                    count++;
                }
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
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("enter the sum target for array");
        int target = sc.nextInt();
        int ans = checksum(arr,target);
        System.out.println("the pairs no. of pairs in array having sum equal to target is ="+ans);
    }
}
