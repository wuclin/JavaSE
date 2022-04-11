package RunnableWay;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnableTread());
        thread.start();
        Thread.sleep(2000);
        System.out.println("1.welcome");

    }
}
