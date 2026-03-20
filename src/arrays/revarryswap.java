package arrays;
import java.util.*;

public class revarryswap {

    static void printarray(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    static void swapnum(int arr[], int i,int j){
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;

    }
    static void revarray(int arr[]){
        int i=0,j= arr.length-1;
        int n= arr.length;

        while(i!=j){
            swapnum(arr,i,j);
            i++;
            j--;
        }
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
        revarray(arr);
        printarray(arr);


    }
}
