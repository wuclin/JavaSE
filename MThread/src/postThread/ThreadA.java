package postThread;

public class ThreadA extends Thread {
    @Override
    public void run() {
        Servlet.post("a","aa");
    }
}
