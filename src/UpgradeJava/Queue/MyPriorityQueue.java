package UpgradeJava.Queue;

import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> integers = new PriorityQueue<>();
        integers.add(1);
        integers.add(4);
        integers.add(3);
        integers.add(2);

        System.out.println(integers);
        System.out.println(integers.peek());
    }
}

