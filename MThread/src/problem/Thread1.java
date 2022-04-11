package problem;

public class Thread1 extends Thread {
    private int count = 5;

    private ThreadLocal<Integer> local = new ThreadLocal<>();

    @Override
    public void run() {
        super.run();
        synchronized (this){
           // count--;
           // System.out.println(this.getName()+"count:"+count);
            setLocal();
            int c = local.get();
            System.out.println(this.getName()+"count:"+ --c);
        }
    }

    public void setLocal(){
        local.set(6);
    }
}
