package Exercise.Ex9;

import java.util.HashMap;

public class Ex9 {
    public static void main(String[] args) {
        HashMap<String, Integer> Hashmap = new HashMap<>();
        Hashmap.put("apple", 5);
        Hashmap.put("banana", 3);
        Hashmap.put("orange", 8);
        Hashmap.put("grape", 2);
        Hashmap.put("watermelon", 10);
        System.out.println(Hashmap.containsKey("apple"));
        System.out.println(Hashmap.containsKey("mango"));
    }
}
