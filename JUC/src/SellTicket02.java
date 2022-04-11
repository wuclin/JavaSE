import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket02 {

    public static void main(String[] args){
    Ticket2 ticket = new Ticket2();

    new Thread(()->{
        for (int i=0; i<30; i++)
            ticket.sell();
    },"a").start();

    new Thread(()->{
        for (int i=0; i<30; i++)
            ticket.sell();
    },"b").start();

    new Thread(()->{
        for (int i=0; i<30; i++)
            ticket.sell();
    },"c").start();
}
}

//作为资源类
class Ticket2{
    private int number = 50;
    Lock lock = new ReentrantLock();

    //使用lock锁

    public void sell(){
        lock.lock();
        try {
            //业务代码
            if (number > 0)
            {
                System.out.println(Thread.currentThread().getName()+"剩余票数："+ number-- );
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        lock.unlock();


    }

}
