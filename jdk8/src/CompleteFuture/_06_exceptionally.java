package CompleteFuture;

import java.util.concurrent.CompletableFuture;

public class _06_exceptionally {
    public static void main(String[] args){
        SmallTool.printTimeAndThread("准备坐公交回家");

        CompletableFuture cf = CompletableFuture.supplyAsync(()->{
            SmallTool.printTimeAndThread("700公交还有两分钟");
            SmallTool.SleepMillis(1000);
            return "700公交到了";
        }).exceptionally(e -> {
            System.out.println("chu");
            return "other";
        }).applyToEither(CompletableFuture.supplyAsync(()->{
            SmallTool.printTimeAndThread("800公交还有一分钟");
            SmallTool.SleepMillis(2000);
            return "800公交到了";
        }),firstBus -> {
            SmallTool.printTimeAndThread(firstBus);
            if (firstBus.startsWith("700"))
                throw new RuntimeException("延迟");
            return firstBus;
        }).exceptionally(e -> {
            SmallTool.printTimeAndThread(e.getMessage());
            SmallTool.printTimeAndThread("叫出租车");
            return "出租车到了";
        });

        SmallTool.printTimeAndThread(String.format("%s, 回家", cf.join()));
    }
}
