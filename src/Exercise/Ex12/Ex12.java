package Exercise.Ex12;

import java.util.TreeMap;

public class Ex12 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 7,8};
        TreeMap<Integer,Integer> treeMap=new TreeMap<>();
        for (int element:array){
            treeMap.put(element,0);
        }
        int x=treeMap.lastKey();
        treeMap.remove(x);
        System.out.println("Số lớn thứ 2 là "+treeMap.lastKey());
    }
}
