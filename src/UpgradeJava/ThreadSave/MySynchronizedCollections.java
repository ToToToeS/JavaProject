package UpgradeJava.ThreadSave;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySynchronizedCollections {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list.add(i);
        }

        List<Integer> target = Collections.synchronizedList(new ArrayList<>());

        Runnable ran = () -> {target.addAll(list); };

        Thread thread1 = new Thread(ran);
        Thread thread2 = new Thread(ran);
        Thread thread3 = new Thread(ran);
        Thread thread4 = new Thread(ran);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println(target);
    }
}
