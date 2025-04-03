import java.util.*;

public class factorial {

    public static int fact(int num) {
        int result = 0;
        if (num == 0 || num == 1) {
            return 1;
        } else {
            result = num * fact(num - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int num = sc.nextInt();
        int result = fact(num);
        System.out.println("factorial of " + num + " is = " + result);
        sc.close();
    }
}