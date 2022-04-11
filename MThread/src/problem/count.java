package problem;

public class count {
    public static void main(String[] args){
        Thread1 thread1 = new Thread1();
        Thread a = new Thread(thread1,"a");
        Thread b = new Thread(thread1,"b");
        Thread c = new Thread(thread1,"c");

        a.start();
        b.start();
        c.start();

    }
}
