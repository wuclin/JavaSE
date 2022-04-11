import java.util.concurrent.FutureTask;
import java.util.concurrent.Callable;
public class CallabeTest {
    public static void main(String[] args){

        new Thread().start();
        //这个方法只能调用runnable

        //通过FutureTask类作为适配类，把Callable加入线程中
        //FutureTask本身就是Runnable
        CallableThread callableThread = new CallableThread();
        FutureTask futureTask = new FutureTask(callableThread);
        new Thread(futureTask).start();


    }
}
class CallableThread implements Callable {

    @Override
    public Object call() throws Exception {
        return null;
    }
}