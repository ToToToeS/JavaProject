package UpgradeJava.ArrayList;

import java.util.ArrayList;

public class MyArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(100);
        ArrayList<String> list3 = new ArrayList<>(list2);


        list1.add("Hello");                               // ADD
        list1.add(1, "world");
        list1.add("!!!");

        String str = list1.get(1);                        //GET

        list1.set(1, "the world");                        //SET

        System.out.println(list1.remove(str + "a" + list1.remove(list1.get(1)))); //remove

        list2.add("IVAN");
        list2.addAll(list1);                               //ADDALL

        System.out.println(list2);
        list2.clear();                                     //Clear
        System.out.println(list2);
        System.out.println(list1.indexOf("Hello"));        //indexOf  and lastIndexOf
        System.out.println(list1);                         //size
                                                           //isEmpty
                                                           //Contains
                                                           //ToString
    }
}