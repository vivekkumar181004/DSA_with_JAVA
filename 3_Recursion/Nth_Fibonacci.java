import java.util.*;

public class Nth_Fibonacci {

    public static int Fibo(int n) {
        int result = 0;
        if (n == 0 || n == 1) {
            return n;
        } else {
            result = Fibo(n - 1) + Fibo(n - 2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth number : ");
        int n = sc.nextInt();
        int result = Fibo(n);
        System.out.println("The final output is : " + result);

        sc.close();
    }

}
