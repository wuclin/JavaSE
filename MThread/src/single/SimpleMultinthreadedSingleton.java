package single;

/**
 * 多线程，不过每次创建对象都要加锁
 */
public class SimpleMultinthreadedSingleton {
    private static SimpleMultinthreadedSingleton instance = null;

    private SimpleMultinthreadedSingleton(){}

    public static SimpleMultinthreadedSingleton getInstance(){
        synchronized (SimpleMultinthreadedSingleton.class){
            if (instance == null)
                instance = new SimpleMultinthreadedSingleton();
            return instance;
        }
    }

}
