import java.util.*;

public class linearSearch {
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
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == search) {
                index = i;
                break;
            }
        }

        if(index==-1){
            System.out.println("element "+search+ " is not found!");
        }else{
            System.out.println("element "+search+ " is found at an index "+index);
        }

        sc.close();
    }
}
