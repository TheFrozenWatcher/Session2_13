package Exercise.Ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 4, 1};
        Map<Integer, Integer> occurenceMap = new HashMap<>();
        for (int element : array) {
            if (occurenceMap.containsKey(element)) {
                occurenceMap.put(element, occurenceMap.get(element) + 1);
            } else {
                occurenceMap.put(element, 1);
            }
        }
        ArrayList<Integer> uniqueArray=new ArrayList<>();
        for (int key : occurenceMap.keySet()) {
            if (occurenceMap.get(key) == 1) {
                uniqueArray.add(key);
            }
        }
        System.out.println(uniqueArray);
    }
}
