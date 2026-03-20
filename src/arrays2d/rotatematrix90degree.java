package arrays2d;
import java.util.Scanner;

public class rotatematrix90degree {

    Scanner sc = new Scanner(System.in);

    static void printmatrix(int[][] matrix){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reversearray(int[]arr){
        int i = 0;
        int j;
        j =arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void transposeinplace(int[][]a,int r,int c){
        for (int i = 0; i < r ; i++) {
            for (int j = i; j < c ; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
    static void rotatearray(int[][]matrix ,int n){
        transposeinplace(matrix,n,n);

        for (int i = 0; i <n ; i++) {
            reversearray(matrix[i]);
        }
        printmatrix(matrix);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimensions of the matrix");
        int r = sc.nextInt();
        int c = r;
        int[][] a = new int[r][c];

        System.out.println("enter the elements of matrix ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        rotatearray(a,r);


    }
}
