package stopThread;

public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5000; i++) {
                if (this.isInterrupted())
                    throw new Exception();
                //return;这里最好用抛出异常的方式
                System.out.println(i);
        }
        } catch (Exception e) {
            System.out.println("stop");
            e.printStackTrace();
        }
    }
}
