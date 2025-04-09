import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Convert to char array (optional)
        // char[] chars = s.toCharArray();

        // Map to store frequency of each character
        HashMap<Character, Integer> map = new HashMap<>();

        // construction of a HashTable
        // key - unique characters in the string
        // value - frequency of each character in the string
        // First pass: Count frequency
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) { // is character present in map
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        // Second pass: Find first character index with frequency = 1
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                System.out.println("First non-repeating character index is : " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
