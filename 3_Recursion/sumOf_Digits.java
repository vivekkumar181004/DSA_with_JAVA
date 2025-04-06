import java.util.*;

public class sumOf_Digits {

    public static int sumOfDigits(int n) {
        int result = 0;
        if (n == 0) {
            return 0;
        } else {
            result = n % 10 + sumOfDigits(n / 10);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int result = sumOfDigits(n);
        System.out.println("The sum of given digits is : " + result);
    }

}