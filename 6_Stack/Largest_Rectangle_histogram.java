import java.util.Scanner;
import java.util.Stack;

public class Largest_Rectangle_histogram {

    public static int largestRectangleArea(int[] heights, int n) {

        int[] prevSmaller = new int[n];
        int[] nextSmaller = new int[n];

        Stack<Integer> stack1 = new Stack<>();

        // Step 1: Find Previous Smaller Index for each bar
        for (int i = 0; i < n; i++) {
            while (!stack1.isEmpty() && heights[stack1.peek()] >= heights[i]) {
                stack1.pop();
            }
            prevSmaller[i] = stack1.isEmpty() ? -1 : stack1.peek();
            stack1.push(i);
        }

        // Clear the stack for next use
        stack1.clear();

        // Step 2: Find Next Smaller Index for each bar
        for (int i = n - 1; i >= 0; i--) {
            while (!stack1.isEmpty() && heights[stack1.peek()] >= heights[i]) {
                stack1.pop();
            }
            nextSmaller[i] = stack1.isEmpty() ? n : stack1.peek();
            stack1.push(i);
        }

        // Step 3: Calculate max area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nextSmaller[i] - prevSmaller[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;

    }

    // Method to calculate the largest rectangle area in the histogram
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no. of the buildings : ");
        int n = sc.nextInt();

        int[] heights = new int[n];
        System.out.println("enter the heights of the buildings : ");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        System.out.println("Largest Area Under Histogram: " + largestRectangleArea(heights, n));

        sc.close();
    }
}




// Previous Smaller Element (PSE) for each histogram bar ----------------------

// Given heights = [2, 1, 5, 6, 2, 3]

// Let’s trace prevSmaller[] step by step:

// i = 0 (2): stack empty → prevSmaller[0] = -1, push 0

// i = 1 (1): height at top (2) ≥ 1 → pop → stack empty → prevSmaller[1] = -1, push 1

// i = 2 (5): height at top (1) < 5 → prevSmaller[2] = 1, push 2

// i = 3 (6): top (5) < 6 → prevSmaller[3] = 2, push 3

// i = 4 (2): top (6) ≥ 2 → pop 3, 2 → top is 1 < 2 → prevSmaller[4] = 1, push 4

// i = 5 (3): top (2) < 3 → prevSmaller[5] = 4, push 5

// Final prevSmaller = [-1, -1, 1, 2, 1, 4]




// Next Smaller Element (NSE)  for each bar in the histogram--------------------

// Given: heights = [2, 1, 5, 6, 2, 3]

// Let’s walk through the loop in reverse:

// i = 5 (height 3): No element on the stack, so nextSmaller[5] = 6

// i = 4 (height 2): height 3 (on stack) > 2 → pop → stack empty → nextSmaller[4] = 6

// i = 3 (height 6): stack top is 4 (height 2) < 6 → nextSmaller[3] = 4

// i = 2 (height 5): stack top is 3 (height 6) > 5 → pop → stack top 4 (height 2) < 5 → nextSmaller[2] = 4

// i = 1 (height 1): pop 2 (height 5), 3 (6), 4 (2), 5 (3) → stack empty → nextSmaller[1] = 6

// i = 0 (height 2): stack top is 1 (height 1) < 2 → nextSmaller[0] = 1

