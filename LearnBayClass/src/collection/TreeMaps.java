package collection;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMaps {
    public static void main(String[] args) {
        System.out.println("treemap");

       TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(5, 10);
        treeMap.put(8, 20);
        treeMap.put(9, 30);
        treeMap.put(3, 40);
        treeMap.put(2, 80);
        treeMap.put(1, 45);

        System.out.println(treeMap);

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(50);
        treeSet.add(80);
        treeSet.add(30);
        treeSet.add(20);

        System.out.println(treeSet);


    }
}
