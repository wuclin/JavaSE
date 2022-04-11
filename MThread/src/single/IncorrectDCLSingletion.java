package single;

/**
 * 只有在判断没有对象生成时才加锁生成对象，不过这样还是有问题
 * 对于操作3来说分为3个子操作：
 * 1.分配对象所需的存储空间
 * 2.初始化引用对象
 * 3.将对象引用写入共享变量
 * 指令重排序有可能导致操作变成1，3，2
 * 即在初始化对象之前将对象的引用写入了实例变量instance
 * 这样会导致操作1时误以为实例已经初始化好了
 */
public class IncorrectDCLSingletion {
    private static IncorrectDCLSingletion instance = null;  //加上volatile即可

    private IncorrectDCLSingletion(){}

    public static IncorrectDCLSingletion getInstance(){
        if (instance == null){    //操作一，第一次检查
            synchronized (IncorrectDCLSingletion.class){
                if (instance == null)//操作二，第二次检查
                    instance = new IncorrectDCLSingletion();//操作3
            }
        }
        return instance;
    }

}
