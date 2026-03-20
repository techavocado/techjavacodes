package arrays;

public class elsearch {
    static int traverse(int arr[], int x) {

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {1, 9, 4, 15, 5, 55, 33, 12};
        System.out.println("element found at index " + traverse(arr, 99));

    }
}
