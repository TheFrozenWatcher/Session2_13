package Exercise.Ex7;

import java.util.HashMap;
import java.util.Map;

public class Ex7 {
    public static void main(String[] args) {
        HashMap<String, Integer> Hashmap = new HashMap<>();
        Hashmap.put("apple", 5);
        Hashmap.put("banana", 3);
        Hashmap.put("orange", 8);
        Hashmap.put("grape", 2);
        Hashmap.put("watermelon", 10);
        HashMap<String,Integer> newHashMap= new HashMap<>();
        newHashMap.putAll(Hashmap);
        System.out.println("HashMap gốc: " + Hashmap);
        System.out.println("HashMap mới (sao chép): " + newHashMap);

    }
}
