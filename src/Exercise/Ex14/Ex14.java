package Exercise.Ex14;

import java.util.Comparator;
import java.util.TreeMap;

public class Ex14 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.put(5, 50);
        treeMap.put(2, 20);
        treeMap.put(8, 80);
        treeMap.put(1, 10);
        treeMap.put(7, 70);
        System.out.println("Các phần tử của TreeMap theo thứ tự giảm dần của giá trị:");
        for (var entry : treeMap.entrySet()) {
            System.out.println("Khóa: " + entry.getKey() + ", Giá trị: " + entry.getValue());
        }
    }
}
