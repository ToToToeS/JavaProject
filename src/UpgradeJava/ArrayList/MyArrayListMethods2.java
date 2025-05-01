package UpgradeJava.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayListMethods2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] arrays = {sb1, sb2, sb3, sb4};

        List<StringBuilder> list = new ArrayList<StringBuilder>(Arrays.asList(arrays));

        System.out.println(list);
        arrays[0].append("!!!");
        System.out.println(list);


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("C");
        list2.add("D");


        //System.out.println(list1.retainAll(list2) + " " + list2); //retain остовляет только елементы которые есть в list2

        System.out.println(list1.containsAll(list2));  // containsAll проверяет содержитаться все элемениы второго list в пераом

        List<String> myList = list1.subList(0, 2);

        String[] array = list1.toArray(new String[0]); // Без new String[0] возражает массив Object


        List<Integer> list5 = List.of(1, 2, 3 );
        //System.out.println(list5.add(4)); ERROR  --> List.of не позволяет изменять лист

        List<String> list3 = List.copyOf(list1);
        //System.out.println(list3.add("aaaa")); ERROR  --> List.copyOf не позволяет изменять лист
    }
}
