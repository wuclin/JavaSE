package example;

public class ThreadA extends Thread{
    private MyObject object;
    public ThreadA(MyObject object){
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        try {
            object.methodA();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
