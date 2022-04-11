package CompleteFuture;

import java.util.concurrent.CompletableFuture;

public class _02_thenCompose {
    public static void main(String[] args){
        SmallTool.printTimeAndThread("开始");
        SmallTool.printTimeAndThread("加入");

        CompletableFuture<String> cf = CompletableFuture.supplyAsync(()->{
            SmallTool.printTimeAndThread("拿东西1");
            SmallTool.SleepMillis(2000);
            return "做好东西1了";
        }).thenCompose(res -> CompletableFuture.supplyAsync(() -> {
            SmallTool.printTimeAndThread("拿东西2");
            SmallTool.SleepMillis(1000);
            return res +"，拿好东西2了";
        }));
        //这里的res是自定义的，代表前面一个任务的返回值，且thenCompose的内容会等到执行前面的任务
        //执行完之后才执行
        //对于supplyAsync可以理解为里面的执行代码会在另外一个线程执行


        SmallTool.printTimeAndThread("做其他的事");
        SmallTool.printTimeAndThread(String.format("%s ,可以", cf.join()));
    }
}
