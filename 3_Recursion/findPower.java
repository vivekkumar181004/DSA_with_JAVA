import java.util.*;

public class findPower {

    public static int findofPower(int a, int b) {
        int mid;
        int result;
        int finalresult;
        if (b == 1) {
            return a;
        } else if (b == 0) {
            return 1;
        } else {
            mid = b / 2;
            result = findofPower(a, mid);
            finalresult = result * result;
            if (b % 2 != 0) {
                return finalresult * a;
            } else {
                return finalresult;
            }
        } 

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a : ");
        int a = sc.nextInt();
        System.out.print("Enter the b : ");
        int b = sc.nextInt();
        int output = findofPower(a, b);
        System.out.println("the result of " + a + " ^ " + b + " is : " + output);
    }
}



// Ah, I see the issue! When you try to calculate 2^64, your program prints 0. That's not a logic bug — it's an overflow issue.

// 🤯 Why it happens:
// You're using int in Java, which can only store values from -2,147,483,648 to 2,147,483,647.

// But 2^64 = 18,446,744,073,709,551,616 — way beyond what int can hold.

// So the multiplication overflows, wraps around, and you get incorrect results like 0.

// ✅ Solution:
// You need to use long or even better, BigInteger if you're dealing with very large numbers.