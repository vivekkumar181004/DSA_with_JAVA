import java.util.*;

public class prefixSumApproach {

    public static int findSumMatrix(int[][] arr, int r1, int r2, int c1, int c2) {
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter no of rows:");
        int m = obj.nextInt();
        System.out.println("enter no. of columns");
        int n = obj.nextInt();

        int arr[][] = new int[m][n];
        System.out.println("enter the elements of matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = obj.nextInt();
            }
        }
        // Optional: Print the matrix to verify input
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int r1, r2, c1, c2;
        System.out.print("enter the value of r1 coordinate:");
        r1 = obj.nextInt();
        System.out.print("enter the value of c1 coordinate:");
        c1 = obj.nextInt();
        System.out.print("enter the value of r2 coordinate:");
        r2 = obj.nextInt();
        System.out.print("enter the value of c2 coordinate:");
        c2 = obj.nextInt();

        // function call
        int result = findSumMatrix(arr, r1, r2, c1, c2);
        System.out.println("sum of the elements in the rectangle is : " + result);

        obj.close();

    }
}
