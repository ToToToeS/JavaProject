package UpgradeJava;

import org.w3c.dom.CharacterData;

import java.util.*;

public class myListIterator {
    public static void main(String[] args) {
        String str = "MADAM";

        char[] chars = str.toCharArray();

        List<Character> list = new ArrayList<>();

        for (char c : chars) {
            list.add(c);
        }

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) return;
        }

        System.out.println("It's palindrome ");

        Integer[] a = {1, 2, 3, 4 ,5 ,4};
        Collections.binarySearch(a, 3);
    }
}
