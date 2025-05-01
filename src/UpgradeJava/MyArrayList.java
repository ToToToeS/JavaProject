package UpgradeJava;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(100);
        ArrayList<String> list3 = new ArrayList<>(list2);


        list1.add("Hello");
        list1.add(1, "world");
        list1.add("!!!");

        String str = list1.get(1);

        list1.set(1, "the world");

        System.out.println(list1);
    }
}
