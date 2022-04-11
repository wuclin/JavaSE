public class ThreadB extends Thread {
    private Service service;

    ThreadB(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
        service.methodA();
    }
}
