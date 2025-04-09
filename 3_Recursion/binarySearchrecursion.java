import java.util.*;

public class binarySearchrecursion {

    public static void biSearch(int[] n, int low, int high, int key) {
        if (low > high) {
            System.out.println("Element not found.");
            return;
        }

        int mid = low + (high - low) / 2;

        if (n[mid] == key) {
            System.out.println("Element found at index: " + mid);
            return;
        } else if (n[mid] < key) {
            biSearch(n, mid + 1, high, key);
        } else {
            biSearch(n, low, mid - 1, key);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] n = new int[7];

        System.out.print("Enter the 7 elements in sorted order of array : ");
        for (int i = 0; i < 7; i++) {
            n[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search for: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n.length - 1;

        // Arrays.sort(n); // Just in case user input is unsorted
        biSearch(n, low, high, key);

        sc.close();
    }
}
