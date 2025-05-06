package UpgradeJava.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MyLinkedHash {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> myLinkedHash = new LinkedHashMap<>(16, 0.75f, true);

        myLinkedHash.put(4, "four");
        myLinkedHash.put(1, "one");
        myLinkedHash.put(2, "two");

        myLinkedHash.put(3, "three");
        System.out.println(myLinkedHash);

        System.out.println(myLinkedHash.get(1));
        System.out.println(myLinkedHash.get(4));

        System.out.println(myLinkedHash);
    }
}
