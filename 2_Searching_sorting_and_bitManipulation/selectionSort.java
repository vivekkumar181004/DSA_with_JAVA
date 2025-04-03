import java.util.*;

public class selectionSort {

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_Idx = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if(arr[j]<arr[min_Idx]){
                    min_Idx=j;
                }
            }
            if(min_Idx!=i){
                int temp = arr[i];
                arr[i] = arr[min_Idx];
                arr[min_Idx] = temp; 
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 20, 50, 12, 17, 19, 25, 97, 16 };

        SelectionSort(arr);

        System.out.print("Sorted array is = ");
        System.out.print(Arrays.toString(arr));
    }
}
