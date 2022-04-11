public class SellTicket01 {
    public static void main(String[] args){
        Ticket ticket = new Ticket();

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
class Ticket{
    private int number = 50;
        //加上synchronized 形成同步
    public synchronized void sell(){
        if (number > 0)
        {
            System.out.println(Thread.currentThread().getName()+"剩余票数："+ number-- );
        }
    }

}
