package postThread;

public class ThreadB extends Thread {
    @Override
    public void run() {
        Servlet.post("b","bb");
    }
}
