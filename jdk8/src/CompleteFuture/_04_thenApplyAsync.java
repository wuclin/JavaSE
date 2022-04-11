package CompleteFuture;

import java.util.concurrent.CompletableFuture;

public class _04_thenApplyAsync {public static void main(String[] args){
    SmallTool.printTimeAndThread("开始");
    SmallTool.printTimeAndThread("加入");

    CompletableFuture<String> cf = CompletableFuture.supplyAsync(()->{
        SmallTool.printTimeAndThread("拿500");
        SmallTool.SleepMillis(2000);
        return "500";
    }).thenApplyAsync((res1)->{
        SmallTool.printTimeAndThread("拿东西2");
        SmallTool.SleepMillis(3000);
        return String.format("%s元", res1);
    });


    SmallTool.printTimeAndThread("做其他的事");
    SmallTool.printTimeAndThread(String.format("%s ,可以", cf.join()));
}
}
