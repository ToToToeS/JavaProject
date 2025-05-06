package UpgradeJava.Set;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(1);
        set1.add(8);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(124);

        set1.addAll(set2);
        System.out.println(set1.contains(1));
        System.out.println();

        System.out.println(set1);

        set1.removeAll(set2);
        System.out.println(set2);
    }
}
