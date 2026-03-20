package arrays;

public class maxelement {
    static void maxel(int arr[]){
        int max= arr[0];
        for (int i =1; i < arr.length ; i++) {
            if (arr[i]>max){
                max= arr[i];
            }

        }
        System.out.println("the maximum element in an array is "+max);

    }

    public static void main(String[] args) {
        int arr[] = {-1,-5, 18,-47,-33};
        maxel(arr);


    }
}
