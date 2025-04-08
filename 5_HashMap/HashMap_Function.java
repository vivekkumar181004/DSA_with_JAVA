import java.util.HashMap;
import java.util.Map;

public class HashMap_Function {

    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        // functionality of the put function---------------
        hashmap.put(1,"Sachin");
        hashmap.put(3,"Vivek");
        hashmap.put(9,"Harshit");
        hashmap.put(4,"Prem");
        hashmap.put(7,"Karan");

        System.out.println("HashMap of the given data is : "+hashmap);

        // functionality of the get  function---------------
        String result = hashmap.get(3);
        System.out.println("Value for the given key  is : "+result);

        //  functionality of the containsKey  function---------------
        System.out.println("given key 4 is present or not : "+hashmap.containsKey(4));
        System.out.println("given key 6 is present or not : "+hashmap.containsKey(6));

        // functionality of the remove  function---------------
        hashmap.remove(7);
        System.out.println("updated hashmap  is : "+hashmap);

        // functionality of the keySet() and values()  function---------------
        System.out.println("All keys: " + hashmap.keySet());
        System.out.println("All values: " + hashmap.values());

         // functionality of the entrySet  function---------------
         // iteration using for loop 
         System.out.println("hashmap is ------------------ ");
         for(Map.Entry<Integer, String> e : hashmap.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
         }

    }
}