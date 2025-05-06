package UpgradeJava.Set;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class MyLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(5);
        lhs.add(8);
        lhs.add(425);
        lhs.add(2);

        System.out.println(lhs);
    }
}
