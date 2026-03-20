package arrays;
import java.util.Scanner;

public class lastoccur {

    static int lastindex(int arr[],int x,int ind){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==x){
                ind = i;

            }
        }
        return ind;
    }
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int arr[] = {5,6,5,3,5,4};
                int x = 5;
                int ind = 0;

        System.out.println("the last occurence of the element in the array is on index "+lastindex(arr,x,ind));

    }
}
