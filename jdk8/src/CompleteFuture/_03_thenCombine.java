package CompleteFuture;

import java.util.concurrent.CompletableFuture;

public class _03_thenCombine {
    public static void main(String[] args){
        SmallTool.printTimeAndThread("开始");
        SmallTool.printTimeAndThread("加入");

        CompletableFuture<String> cf = CompletableFuture.supplyAsync(()->{
            SmallTool.printTimeAndThread("拿东西1");
            SmallTool.SleepMillis(2000);
            return "拿好东西1了";
        }).thenCombine(CompletableFuture.supplyAsync(()->{
            SmallTool.printTimeAndThread("拿东西2");
            SmallTool.SleepMillis(3000);
            return "拿好东西2了";
        }),(res1, res2)->{
            SmallTool.printTimeAndThread("都拿好了");
            SmallTool.SleepMillis(100);
            return String.format("%s + %s 好了", res1, res2);
        });


        SmallTool.printTimeAndThread("做其他的事");
        SmallTool.printTimeAndThread(String.format("%s ,可以", cf.join()));
    }
}
