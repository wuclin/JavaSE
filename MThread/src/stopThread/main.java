package stopThread;

public class main {
    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        a.start();
        Thread.sleep(10);
        a.interrupt();

    }
}
