package Exercise.Ex5;

import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        HashMap<String, Integer> newHashmap = new HashMap<>();
        newHashmap.put("apple", 5);
        newHashmap.put("banana", 3);
        newHashmap.put("orange", 8);
        newHashmap.put("grape", 2);
        newHashmap.put("watermelon", 10);
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(newHashmap.entrySet());
        Collections.sort(entryList, Map.Entry.comparingByValue());
        System.out.println("HashMap sau khi sắp xếp theo giá trị tăng dần:");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ":");
        }

    }
}
