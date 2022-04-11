package single;

/**
 * 适用于单线程
 */
public class SingleThreadedSingleton {
    private static SingleThreadedSingleton singleThreadedSingleton = null;

    private SingleThreadedSingleton(){}

    public static SingleThreadedSingleton getInstance(){
        if (singleThreadedSingleton == null)
            singleThreadedSingleton = new SingleThreadedSingleton();
        return singleThreadedSingleton;
    }

}
