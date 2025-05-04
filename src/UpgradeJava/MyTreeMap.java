package UpgradeJava;

import java.util.TreeMap;
import static UpgradeJava.MyLinkedList.Student;

public class MyTreeMap {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        treeMap.put(8.1, new Student("Bob", 1));
        treeMap.put(8.7, new Student("Petr", 2));
        treeMap.put(8.3, new Student("Samaly", 4));
        treeMap.put(8.8, new Student("Sofa", 4));

        treeMap.remove(8.1);



        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(8.5));
        System.out.println(treeMap.headMap(8.5));
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry() );

    }
}
