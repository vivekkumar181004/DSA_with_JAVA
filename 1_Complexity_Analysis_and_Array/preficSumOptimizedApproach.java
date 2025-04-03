import java.util.Scanner;

public class preficSumOptimizedApproach {

    public static void prefixSum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        // row-wise prefix sum-------------------------------
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
        // column-wise prefix sum-------------------------------
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    public static int matrixSumRegion(int[][] arr, int r1, int r2, int c1, int c2) {
        int sum = 0, up = 0, left = 0, repeated_region = 0, result = 0;
        sum = arr[r2][c2];
        up = arr[r1 - 1][c2];
        left = arr[r2][c1 - 1];
        repeated_region = arr[r1 - 1][c1 - 1];
        result = sum - up - left + repeated_region;
        return result;

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
        prefixSum(arr);
        int result = matrixSumRegion(arr, r1, r2, c1, c2);
        System.out.println("sum of the elements in the rectangle is : " + result);

        obj.close();
    }
}
