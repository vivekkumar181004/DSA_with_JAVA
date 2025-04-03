import java.util.*;
public class findsquareRoot {
    public static int squareRoot(int num) {
        int result = -1;
        int low = 0;
        int high = num - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long val=mid*mid;
            if (val == num) {
                result = mid;
                break;
            } else if (val < num) {
                low = mid + 1;
                result=mid;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of which you want to find the square root = ");
        int num = sc.nextInt();
        int result = squareRoot(num);
        System.out.println("square root of "+num+" is = "+result);
        sc.close();
    }

}
