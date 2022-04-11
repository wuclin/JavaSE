package ThreadWay;

public class main {
    public static void main(String[] args){
        Thread thread = new MyThread();
        thread.start();
        System.out.println("1.welcome");
    }
}
