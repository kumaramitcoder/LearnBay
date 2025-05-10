package collection;

import java.util.HashMap;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        System.out.println("MAP");

        HashMap<String, Integer> map = new HashMap<>();

        System.out.println(map);
        map.put("India", 2000);
        map.put("China", 3500);
        map.put("Us", 2500);
        map.put("Rusia", 3000);

        System.out.println(map);
// size
        int count = map.size();
        System.out.println(count);
        Set<String> set = map.keySet();
        System.out.println(set);

        // how to read the value
        System.out.println("---");
        int x = map.get("India");
        System.out.println(x);

        boolean flag = map.containsValue(2000);

        System.out.println(flag);


    }
}
