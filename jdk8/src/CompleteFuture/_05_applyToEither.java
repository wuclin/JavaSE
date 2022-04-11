package CompleteFuture;

import java.util.concurrent.CompletableFuture;

public class _05_applyToEither {
    public static void main(String[] args){
        SmallTool.printTimeAndThread("等公交");

        CompletableFuture<String> bus = CompletableFuture.supplyAsync(()->{
            SmallTool.printTimeAndThread("公交1还有两分钟");
            SmallTool.SleepMillis(2000);
            return "公交1到了";
        }).applyToEither(CompletableFuture.supplyAsync(()->{
            SmallTool.printTimeAndThread("公交2还有1秒");
            SmallTool.SleepMillis(1000);
            return "公交2到了";
        }),firstBus -> firstBus);
        //这里的firstBus是上面任务的返回值哪一个先到就先取哪一个返回值

        SmallTool.printTimeAndThread(String.format("%s,坐车回家",bus.join()));
    }
}
