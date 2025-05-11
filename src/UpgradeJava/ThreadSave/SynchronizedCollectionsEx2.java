package UpgradeJava.ThreadSave;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionsEx2 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());

        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        Runnable runnable1 = () -> {
            synchronized (list) {
                Iterator<Integer> iterator = list.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };

        Runnable runnable2 = () -> {
            list.remove(0);
            };

        Thread thread1 = new Thread(runnable1);

        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(list);
    }
}
