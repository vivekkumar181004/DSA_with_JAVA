import java.util.*;

public class alternateSumSeries {

    public static int altSum(int n) {
        int result = 0;

        // 1. base case condition
        if (n == 0) {
            return 0;
        }
        // 2. recursive function call
        // num is even
        else if (n % 2 == 0) {
            result = altSum(n - 1) - n;
        }
        // num is odd
        else {
            result = altSum(n - 1) + n;
        }
        return result;
    }

    // Driver Code------------------------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int result = altSum(n);
        System.out.println("The alternate sum series is : " + result);
        
        sc.close();
    }
}
