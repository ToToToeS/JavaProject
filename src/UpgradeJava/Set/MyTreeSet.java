package UpgradeJava.Set;

import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(){};
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(10);

        treeSet.remove(5);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(9));
        System.out.println(treeSet.tailSet(3));
        System.out.println(treeSet.subSet(1, 5));
    }
    
}
