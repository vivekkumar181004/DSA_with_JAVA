import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps_types {
    public static void main(String[] args){

        // unordered return type
        HashMap<Integer,String> map =new HashMap<>();
        map.put(3,"sejal");
        map.put(1,"ansh");
        map.put(7,"vivek");
        map.put(5,"harshit");
        System.out.println("HashMap class map looks like : "+map);

        // order of insertion retained in LinkedHashMap
       LinkedHashMap<Integer,String> map1 =new LinkedHashMap<>();
        map1.put(3,"sejal");
        map1.put(1,"ansh");
        map1.put(7,"vivek");
        map1.put(5,"harshit");
        System.out.println("LinkedHashMap class map looks like : "+map1);

        // sorted output on the basis of the keys
        TreeMap<Integer,String> map2 =new TreeMap<>();
        map2.put(3,"sejal");
        map2.put(1,"ansh");
        map2.put(7,"vivek");
        map2.put(5,"harshit");
        map2.put(6,"aanchal");
        System.out.println("TreeMap class map looks like : "+map2);
    }
}
