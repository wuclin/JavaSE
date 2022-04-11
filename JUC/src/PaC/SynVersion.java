package PaC;

public class SynVersion {
    public static void main(String[] args){
        Data data = new Data();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } 
        },"A");
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B");
    }
}
class Data{

    private int number = 0;

    public synchronized void increment() throws InterruptedException {
        while (number != 0){
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName()+ "1");
        this.notifyAll();
    }

    public synchronized void decrement() throws InterruptedException {
        while (number == 0){
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName()+ "2");
        this.notifyAll();
    }

}
