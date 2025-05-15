package UpgradeJava.ThreadSave;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcaredeHashMapEX {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        Exception b = new RuntimeException();

        map.put(1, "Petr");
        map.put(2, "EGA");
        map.put(3, "Nikita");
        map.put(4, "John");
        map.put(5, "Vika");
        map.put(6, "Nasya");

        System.out.println(map);

        Runnable run1 = () -> {
            Iterator<Integer> iter = map.keySet().iterator();
            while (iter.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                Integer i = iter.next();
                System.out.println(i + " : " + map.get(i));
            }
        };

        Runnable run2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(7, "Added Name");
        };

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(map);
    }
}
