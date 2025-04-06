import java.util.Scanner;

public class stairCaseProblem {
    public static int countWays(int n){
        int result=0;
        if(n<=1){
            return n;
        }else{
            result= countWays(n-1)+countWays(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of stairs : ");
        int n = sc.nextInt();

        // relationships between the count of stairs problem and fibonacci series problem-----
        int output = countWays(n+1);
        System.out.println("Number of ways is : "+ output);
    }
}




