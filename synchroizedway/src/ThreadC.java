public class ThreadC extends Thread{
    DoService doService;

    public void setDoService(DoService doService){
        this.doService = doService;
    }

    @Override
    public void run() {
        doService.methodE();
    }
}
