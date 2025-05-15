package UpgradeJava.ThreadSave;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEX {
    public static void main(String[] args) {
//        ArrayBlockingQueue<Integer> ints = new ArrayBlockingQueue<>(5);
//        ints.add(1);
//        ints.add(1);
//        ints.add(1);
//        ints.add(1);
//        System.out.println(ints.offer(2));
//        System.out.println(ints.offer(2));
//        ints.offer(2);
//
//        System.out.println(ints);


        ArrayBlockingQueue<Integer> nums = new ArrayBlockingQueue<>(4);


        Runnable offer = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    nums.put(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable get = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    System.out.println(nums.take() + " " + nums);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(offer);
        Thread t2 = new Thread(get);

        t1.start();
        t2.start();
    }
}
