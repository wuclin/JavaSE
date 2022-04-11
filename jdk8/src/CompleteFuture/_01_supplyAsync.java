package CompleteFuture;

import java.util.concurrent.CompletableFuture;

public class _01_supplyAsync {
    public static void main(String[] args){
        SmallTool.printTimeAndThread("开始");
        SmallTool.printTimeAndThread("加入");

        CompletableFuture<String> cf = CompletableFuture.supplyAsync(()->{
            SmallTool.printTimeAndThread("拿东西1");
            SmallTool.SleepMillis(2000);
            SmallTool.printTimeAndThread("拿东西2");
            SmallTool.SleepMillis(1000       );
            return "做好了";
        });


        SmallTool.printTimeAndThread("做其他的事");
        SmallTool.printTimeAndThread(String.format("%s ,可以", cf.join()));
    }
}
