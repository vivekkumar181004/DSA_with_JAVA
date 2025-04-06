import java.util.Scanner;

public class printMultiples {

    public static void printMul(int n, int k) {
        if (k == 1) {
            System.out.println(n + " * " + k + " = " + n);
            return;
        } else {
            printMul(n, k - 1);
            System.out.println(n + " * " + k + " = " + n*k);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the multiplier : ");
        int n = sc.nextInt();
        System.out.print("Enter the no. of multiples : ");
        int k = sc.nextInt();
        printMul(n, k);
    }
}
