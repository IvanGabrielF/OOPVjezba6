package pckg_zd2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(21, "Stipe");
        hashMap.put(159, "Divna");
        hashMap.put(985, "Etna");
        hashMap.put(455, "Petar");
        hashMap.put(5788, "Vlatka");

        System.out.println("HashMap: ");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("id= " + key + " name= " + value);
        }
        System.out.println("TreeMap");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.putAll(hashMap);
        writeOut(treeMap);
        LinkedHashMap<Integer, String> hashMap1 = new LinkedHashMap<>();
        System.out.println("LinkedHashMap");
        hashMap1.putAll(hashMap);
        writeOut(hashMap1);


    }
    public static void writeOut(Map<Integer, String> map){
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("id= " + entry.getKey() + " name= " + entry.getValue());


        }
    }
}
