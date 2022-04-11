public class main {
    /**
     * 1.对于一个对象多个线程，同一时间只能有一个线程能运行
     * 2.对于多个对象多个线程，由于不同对象有不同的锁，synchronized锁的对象不一样，所以不会产生影响
     * 3.线程在执行同步方法时，不会影响其他线程执行非同步的方法
     * 4.加在静态方法上相当于给类加锁，对于线程访问静态方法会有影响
     * @param args
     */
    public static void main(String[] args) throws Exception{
        DoService service = new DoService();
        DoService service1 = new DoService();
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();
        ThreadD d = new ThreadD();
        a.setName("A");b.setName("B");c.setName("C");d.setName("D");
        a.setDoService(service);b.setDoService(service1);
        c.setDoService(service);d.setDoService(service);
       /* d.start();
        *//*b.start();

        a.start();*//*

        c.start();*/

        ThreadF f = new ThreadF();
        ThreadG g = new ThreadG();
        f.setDoService(service);g.setDoService(service);
        f.start();g.start();

    }
}
