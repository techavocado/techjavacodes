package arrays2d;
import java.util.*;

public class matrixtransposeinplace {

    static void printmatrix(int[][] matrix){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transposeInPlace(int[][]a, int r, int c){
        for (int i = 0; i < r ; i++) {
            //second loop will start from i bcoz no need to change the lower trianglar matrix
            for (int j = i; j < c ; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        printmatrix(a);
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
        transposeInPlace(a,r,c);
    }
}