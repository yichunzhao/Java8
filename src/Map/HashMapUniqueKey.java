/*
 * 
 * hashmap 
 * 
 */
package Map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author YNZ
 */
public class HashMapUniqueKey {
    
    public static void main(String[] args) {
        
        //duplicate keys overlap each other.
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("first", 12);
        myMap.put("first", 120);
        
        System.out.println("" + myMap);
        
    }
    
}
