public class ThreadF extends Thread{
    DoService doService;

    public void setDoService(DoService doService){
        this.doService = doService;
    }

    @Override
    public void run() {
        doService.methodF();
    }
}
