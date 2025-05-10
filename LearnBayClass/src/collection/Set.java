package collection;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        System.out.println("Set");
        java.util.Set<Integer> set = new HashSet<>();
        System.out.println(set);
        // Add element into HashSet
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set);

        // Checking if an element is present or not

        boolean isAvailable = set.contains(20);

        System.out.println(isAvailable);

        // remove element from HashSet

        set.remove(10);
        set.remove(60);
        System.out.println(set);

        // counting total no of element
        int count = set.size();
        System.out.println(count);

    }
}
