public class ThreadA extends Thread {
    private Service service;

    ThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
