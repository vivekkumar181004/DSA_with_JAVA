import java.util.HashMap;
import java.util.Scanner;

public class twoSum_Problem {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          // Input array size
          System.out.println("enter the size of array : ");
          int n = sc.nextInt();

          // input array elements in an array
          int[] arr = new int[n];
          System.out.println("enter the elements of array : ");
          for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }

          // Input target value
          System.out.println("enter the target element of array : ");
          int target = sc.nextInt();

          // create a hashmap where a key is arr[i] and value is index- i
          HashMap<Integer, Integer> map = new HashMap<>();
          for (int i = 0; i < n; i++) {
               map.put(arr[i], i);
          }

          // create a result array to display index of two elements
          int[] result = new int[2];
          boolean found = false;

          for (int i = 0; i < n; i++) {
               // if current element is equal to target
               if (arr[i] == target && map.containsKey(0)) {
                    result[0] = i;
                    result[1] = map.get(0);
                    found = true;
                    break;
               } else if (map.containsKey(target - arr[i])) {
                    // is the element non-repeatable
                    if (map.get(target - arr[i]) > i) {
                         result[0] = i;
                         result[1] = map.get(target - arr[i]);
                         found = true;
                         break;
                    }
               }
          }

          if (found) {
               System.out.println("two sum index value are : [" + result[0] + " , " + result[1] + "]");
          } else {
               System.out.println("No two elements found with sum = " + target);
          }

          sc.close();
     }
}
