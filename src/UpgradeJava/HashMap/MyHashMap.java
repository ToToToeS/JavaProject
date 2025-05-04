package UpgradeJava.HashMap;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap();

        myHashMap.put(1, "one");
        myHashMap.put(2, "two");
        myHashMap.put(3, "three");
        myHashMap.put(4, "four");

        myHashMap.putIfAbsent(4, "five"); //Записывает есл ключа не сущ
        myHashMap.remove(1);
        myHashMap.containsKey(1);
        myHashMap.containsValue("five");
        myHashMap.keySet();
        myHashMap.values();


        System.out.println(myHashMap);

    }
}
