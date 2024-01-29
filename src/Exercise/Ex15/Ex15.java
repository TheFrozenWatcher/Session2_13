package Exercise.Ex15;

import java.util.TreeMap;

public class Ex15 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(1,"abc");
        treeMap.put(2,"xyz");
        treeMap.put(3,"123");
        treeMap.put(4,"a33");
        System.out.println(treeMap);
        treeMap.remove(4);
        System.out.println(treeMap);
    }
}
