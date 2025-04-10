import java.util.*;

public class sliding_Window_Operation {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        // r : stores the final maximums for each window
        int[] r = new int[n - k + 1];
        int ri = 0;

        // q : stores indices of elements (not values).
        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove elements outside window
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }

            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            // q contains index... r contains content
            q.offer(i); // Add current index

            // Add to result if window is ready
            if (i >= k - 1) {
                r[ri++] = nums[q.peek()];
            }
        }
        return r;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int n = 8;
        int k = 3;
        int[] res = new int[n - k + 1];
        res = maxSlidingWindow(arr, k);

        System.out.println("The desired output is : ");

        for (int i = 0; i < n - k + 1; i++) {
            System.out.print(res[i] + "  ");
        }

    }

}
