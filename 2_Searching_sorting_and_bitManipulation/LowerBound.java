import java.util.*;

public class LowerBound {
    public static int LowerBoundbinarySearch(int[] arr, int search) {
        int index = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == search) {
                index = mid;
                high=mid-1;
            } else if (arr[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array = ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of an array");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("enter the element to be search = ");
        int search = sc.nextInt();

        int result = LowerBoundbinarySearch(array, search);

        if (result == -1) {
            System.out.println("element " + search + " is not found!");
        } else {
            System.out.println("element " + search + " is found at an index " + result);
        }
        sc.close();
    }
}
