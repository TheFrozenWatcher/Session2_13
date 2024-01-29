package Exercise.Ex1;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,1,2,5,6,7,8,4,1};
        Map<Integer,Integer> occurenceMap=new HashMap<>();
        for (int element: array){
            if (occurenceMap.containsKey(element)){
                occurenceMap.put(element,occurenceMap.get(element)+1);
            } else {
                occurenceMap.put(element,1);
            }
        }
        System.out.println("Số lần xuất hiện của từng phần tử:");
        for (int key: occurenceMap.keySet()){
            System.out.println("Phần tử "+key+" xuất hiện "+occurenceMap.get(key)+ " lần.");
        }
    }
}
