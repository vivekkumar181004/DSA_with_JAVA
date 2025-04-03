// !code to find a missing no. in a given array------------------------------------------------------------------------------
public class missingNumber {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,9,6,8};
        int n= array.length;

        int sum_natural_numbers=((n+1)*(n+2))/2;
        int sum=0;
        for(int i=0; i<n; i++){
            sum +=array[i];
        }
        int missing_No = sum_natural_numbers-sum;
        System.out.println("missing element is = "+missing_No);

    }
}
