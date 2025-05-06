package UpgradeJava.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyDeque {
    public static void main(String[] args) {
        Deque<Integer> deque= new ArrayDeque<>();
        deque.addFirst(2);
        deque.addLast(2);

        deque.offerFirst(3);
        deque.offerLast(4);

        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        System.out.println(deque.peekFirst());

        deque.add(10);



        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
    }
}
