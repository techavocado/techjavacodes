package arrays;
import java.util.*;

public class sortedsquares {

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

        while(i<j){
            swapnum(arr,i,j);
            i++;
            j--;
        }
    }

    static int[] sortsqaures(int[] arr){
        int n = arr.length;
        int left = 0,right = n-1,k=0;
        int[] ans = new int[n];

        while(left<=right){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++]= arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++] = arr[right]*arr[right];
                right--;
            }
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
        int ans[] = sortsqaures(arr);
        revarray(ans);
        printarray(ans);

    }
}
