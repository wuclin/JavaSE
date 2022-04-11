public class ThreadB extends Thread{
    DoService doService;

    public void setDoService(DoService doService){
        this.doService = doService;
    }

    @Override
    public void run() {
        doService.methodB();
    }
}
