package Exercise.Ex11;

import java.util.TreeMap;

public class Ex11 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 7};
        TreeMap<Integer,Integer> treeMap=new TreeMap<>();
        for (int element:array){
            treeMap.put(element,0);
        }
        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        for (int key : treeMap.keySet()) {
            System.out.println(key);
        }
    }
}
