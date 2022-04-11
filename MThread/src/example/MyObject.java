package example;

public class MyObject {
    public synchronized void methodA() throws InterruptedException {
        System.out.println("methodA"+Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("end");
    }

    public synchronized void methodB() throws InterruptedException {
        System.out.println("methodB"+Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("end");
    }
}
