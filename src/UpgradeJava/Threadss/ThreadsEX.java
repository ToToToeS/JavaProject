package UpgradeJava.Threadss;

public class ThreadsEX {
    public static void main(String[] args) throws InterruptedException {
        Runnable ran = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        for (int i = 0; i < 10; i ++) {
            Thread t1 = new Thread(ran);
            t1.start();
            Thread t2 = new Thread(ran);
            t2.start();

            t1.join();
            t2.join();
        }
    }
}
