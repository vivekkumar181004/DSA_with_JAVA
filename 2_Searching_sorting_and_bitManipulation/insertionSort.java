import java.util.*;

public class insertionSort {

    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            while( j > 0 && arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1]; 
                    arr[j - 1] = temp;
                    j--;
                }
            }
    }

    public static void main(String[] args) {
        int arr[] = { 20, 50, 25, 67, 79, 12, 15 };

        InsertionSort(arr);

        System.out.print("Sorted array is = ");
        System.out.print(Arrays.toString(arr));

    }
}
