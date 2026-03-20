package arrays2d;
import java.util.*;

public class matrixmultiplication {

    static void printmatrix(int[][] matrix){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void mulmatrix(int[][]a,int[][]b,int r1,int c1,int r2,int c2){
        if(c1 != r2){
            System.out.println("matrix multiplication is not possible, wrong dimensions");
            return;
        }
        int [][] mul = new int[r1][c2];

        for (int i = 0; i <r1 ; i++) {
            for (int j = 0; j <c2 ; j++) {
                for (int k = 0; k <c1 ; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("multiplication of two matrix is:");
        printmatrix(mul);

    }
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows and colums of matrix 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("enter the no. of rows and columns of matrix 2 ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];


        System.out.println("enter the elements of matrix 1");
        for (int i = 0; i < r1 ; i++) {
            for (int j = 0; j < c1 ; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the elements of matrix 2");
        for (int i = 0; i < r2 ; i++) {
            for (int j = 0; j < c2 ; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        mulmatrix(a,b,r1,c1,r2,c2);

    }
}
