package example;

public class ThreadB extends Thread{
    private MyObject object;
    public ThreadB(MyObject object){
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        try {
            object.methodB();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
